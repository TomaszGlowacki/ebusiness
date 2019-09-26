package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

/**
  * A repository for people.
  *
  * @param dbConfigProvider The Play db config provider. Play will inject this for you.
  */
@Singleton
class OrderRepository @Inject()(dbConfigProvider: DatabaseConfigProvider, userRepository: UserRepository)(implicit ec: ExecutionContext) {
  // We want the JdbcProfile for this provider
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  // These imports are important, the first one brings db into scope, which will let you do the actual db operations.
  // The second one brings the Slick DSL into scope, which lets you define the table and other queries.
  import dbConfig._
  import profile.api._

  /**
    * Here we define the table. It will have a name of people
    */
  class OrderTable(tag: Tag) extends Table[Order](tag, "orders") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)

    /** The name column */
    def user_id = column[Int]("user_id")

    def shiping_address = column[String]("shiping_address")

    /*
      def user_id_fk = foreignKey("user_fk",user_id, users)(_.id)
    */
    /**

      * This is the tables default "projection".
      *
      * It defines how the columns are converted to and from the Person object.
      *
      * In this case, we are simply passing the id, name and page parameters to the Person case classes
      * apply and unapply methods.
      */
    def * = (id, user_id, shiping_address ) <> ((Order.apply _).tupled, Order.unapply)
  }

  /**
    * The starting point for all queries on the people table.
    */

  import userRepository.UserTable

  val order = TableQuery[OrderTable]

  private val users = TableQuery[UserTable]

  /**
    * Create a person with the given name and age.
    *
    * This is an asynchronous operation, it will return a future of the created person, which can be used to obtain the
    * id for that person.
    */
  def create(user_id: Int, shiping_address: String ): Future[Order] = db.run {
    // We create a projection of just the name and age columns, since we're not inserting a value for the id column
    (order.map(c => (c.user_id, c.shiping_address ))
      // Now define it to return the id, because we want to know what id was generated for the person
      returning order.map(_.id)
      // And we define a transformation for the returned value, which combines our original parameters with the
      // returned id
      into {case ((user_id, shiping_address ),id) => Order(id, user_id, shiping_address)}
      // And finally, insert the person into the database
      ) += (user_id, shiping_address )
  }

  /**
    * List all the people in the database.
    */
  def list(): Future[Seq[Order]] = db.run {
    order.result
  }
}
