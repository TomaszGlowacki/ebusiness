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
class ContactRepository @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  // We want the JdbcProfile for this provider
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  // These imports are important, the first one brings db into scope, which will let you do the actual db operations.
  // The second one brings the Slick DSL into scope, which lets you define the table and other queries.
  import dbConfig._
  import profile.api._

  /**
    * Here we define the table. It will have a name of people
    */
  class ContactTable(tag: Tag) extends Table[Contact](tag, "contact") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)

    /** The name column */
    def firstname = column[String]("firstname")

    def middlename = column[String]("middlename")

    def lastname = column[String]("lastname")

    def message = column[String]("message")

    def email = column[String]("email")


    /**
      * This is the tables default "projection".
      *
      * It defines how the columns are converted to and from the Person object.
      *
      * In this case, we are simply passing the id, name and page parameters to the Person case classes
      * apply and unapply methods.
      */
    def * = (id, firstname, middlename,  lastname,  message, email) <> ((Contact.apply _).tupled, Contact.unapply)
  }

  /**
    * The starting point for all queries on the people table.
    */
  val contact = TableQuery[ContactTable]



  /**
    * Create a person with the given name and age.
    *
    * This is an asynchronous operation, it will return a future of the created person, which can be used to obtain the
    * id for that person.
    */
  def create(firstname: String, middlename: String,  lastname: String, message: String, email: String): Future[Contact] = db.run {
    // We create a projection of just the name and age columns, since we're not inserting a value for the id column
    (contact.map(c => (c.firstname, c.middlename,  c.lastname, c.message, c.email))
      // Now define it to return the id, because we want to know what id was generated for the person
      returning contact.map(_.id)
      // And we define a transformation for the returned value, which combines our original parameters with the
      // returned id
      into {case ((firstname, middlename,  lastname, message, email),id) => Contact(id, firstname, middlename,  lastname, message, email)}
      // And finally, insert the person into the database
      ) += (firstname, middlename,  lastname, message, email)
  }

  /**
    * List all the people in the database.
    */
  def list(): Future[Seq[Contact]] = db.run {
    contact.result
  }
}
