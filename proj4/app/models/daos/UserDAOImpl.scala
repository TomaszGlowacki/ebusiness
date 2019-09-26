package models.daos

import java.util.UUID

import com.mohiva.play.silhouette.api.LoginInfo
import models.{ User, Userdb }
import models.daos.UserDAOImpl.{ users, _ }
import javax.inject.{ Inject, Singleton }
import play.api.data.Form
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.collection.mutable
import scala.concurrent.Future
import scala.concurrent.{ ExecutionContext, Future }
import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import play.api.libs.json._

import scala.concurrent.{ ExecutionContext, Future }
import javax.inject._
import models._
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.validation.Constraints._
import play.api.i18n._
import play.api.libs.json.Json
import play.api._
import play.api.mvc._
import play.api.Play
import play.api.data.Form
import play.api.data.Forms._
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import slick.lifted
import slick.lifted.{ TableQuery, Tag }
import slick.relational.RelationalProfile._

import scala.concurrent.ExecutionContext.Implicits.global

/**
 * Give access to the user object.
 */
class UserDAOImpl @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) extends UserDAO {

  val dbConfig = dbConfigProvider.get[JdbcProfile]
  import dbConfig._
  import profile.api._

  class UserTable(tag: Tag) extends Table[Userdb](tag, "users") {

    /** The ID column, which is the primary key, and auto incremented */
    val user_id = column[Int]("user_id", O.PrimaryKey, O.AutoInc)
    /** The name column */
    val firstname = column[String]("firstname")

    val lastname = column[String]("lastname")

    val email = column[String]("email")

    val password = column[String]("password")

    /**
     * This is the tables default "projection".
     * It defines how the columns are converted to and from the Person object.
     *
     * In this case, we are simply passing the id, name and page parameters to the Person case classes
     * apply and unapply methods.
     */

    def * = (user_id, firstname, lastname, email, password) <> ((Userdb.apply _).tupled, Userdb.unapply)
  }

  var usersdb = lifted.TableQuery[UserTable]
  /**
   * Finds a user by its login info.
   *
   * @param loginInfo The login info of the user to find.
   * @return The found user or None if no user for the given login info could be found.
   */
  def find(loginInfo: LoginInfo) = Future.successful(
    users.find { case (_, user) => user.loginInfo == loginInfo }.map(_._2)
  )

  /**
   * Finds a user by its user ID.
   *
   * @param userID The ID of the user to find.
   * @return The found user or None if no user for the given ID could be found.
   */
  def find(userID: UUID) = Future.successful(users.get(userID))

  /**
   * Saves a user.
   *
   * @param user The user to save.
   * @return The saved user.
   */
  def save(user: User) = {
    users += (user.userID -> user)
    Future.successful(user)
  }

  def add(user2: Userdb): Future[String] = {
    dbConfig.db.run(usersdb += user2)
    Future.successful("done")
  }

  def get(id: Int): Future[String] = {
    dbConfig.db.run(usersdb.filter(_.user_id === id).result.headOption)
    Future.successful("done")
  }

  def update(user2: Userdb): Future[String] = {
    dbConfig.db.run(usersdb.filter(_.user_id === user2.user_id).update(user2))
    Future.successful("done")
  }

}

/**
 * The companion object.
 */
object UserDAOImpl {

  /**
   * The list of users.
   */

  //val dbConfig = DatabaseConfigProvider.get[JdbcProfile](Play.current)

  val users: mutable.HashMap[UUID, User] = mutable.HashMap()

  //  import dbConfig._
  //  import profile.api._
  //
  //  def add(user22: Userdb): Future[String] = {
  //    dbConfig.db.run(usersdb += user22).map(res => "User successfully added").recover {
  //      case ex: Exception => ex.getCause.getMessage
  //    }
  //  }

}

object UserDAOImpldb {

  val form = Form(
    mapping(
      "user_id" -> number,
      "firstName" -> nonEmptyText,
      "middlename" -> nonEmptyText,
      "email" -> nonEmptyText,
      "password" -> nonEmptyText
    )(Userdb.apply)(Userdb.unapply)
  )
}

