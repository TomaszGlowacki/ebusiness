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
class OrderDetailsRepository @Inject()(dbConfigProvider: DatabaseConfigProvider, productRepository: ProductRepository)(implicit ec: ExecutionContext) {
  // We want the JdbcProfile for this provider
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  // These imports are important, the first one brings db into scope, which will let you do the actual db operations.
  // The second one brings the Slick DSL into scope, which lets you define the table and other queries.
  import dbConfig._
  import profile.api._

  /**
    * Here we define the table. It will have a name of people
    */
  class OrderDetailsTable(tag: Tag) extends Table[OrderDetails](tag, "ordersdetails") {

    /** The ID column, which is the primary key, and auto incremented */
    def order_details_id = column[Int]("order_details_id", O.PrimaryKey, O.AutoInc)

    /** The name column */
    def order_id = column[Int]("order_id")

    def product_id = column[Int]("product_id")

    def quantity = column[Int]("quantity")

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
    def * = (order_details_id, order_id, product_id, quantity ) <> ((OrderDetails.apply _).tupled, OrderDetails.unapply)
  }

  /**
    * The starting point for all queries on the people table.
    */

  import productRepository.ProductTable

  val orderdetails = TableQuery[OrderDetailsTable]

  //val products = TableQuery[ProductTable]

  /**
    * Create a person with the given name and age.
    *
    * This is an asynchronous operation, it will return a future of the created person, which can be used to obtain the
    * id for that person.
    */
  def create(order_id: Int, product_id: Int, quantity: Int ): Future[OrderDetails] = db.run {
    // We create a projection of just the name and age columns, since we're not inserting a value for the id column
    (orderdetails.map(c => (c.order_id, c.product_id, c.quantity ))
      // Now define it to return the id, because we want to know what id was generated for the person
      returning orderdetails.map(_.order_details_id)
      // And we define a transformation for the returned value, which combines our original parameters with the
      // returned id
      into {case ((order_id, product_id, quantity),id) => OrderDetails(id, order_id, product_id, quantity)}
      // And finally, insert the person into the database
      ) += (order_id, product_id, quantity)
  }

  /**
    * List all the people in the database.
    */
  def list(): Future[Seq[OrderDetails]] = db.run {
    orderdetails.result
  }
}
