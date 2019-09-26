package models

import java.util.UUID
import java.util.concurrent.Future

import com.mohiva.play.silhouette.api.{ Identity, LoginInfo }
import play.api.Play
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import slick.lifted.TableQuery
import play.api.data.Form
import play.api.data.Forms.mapping

import play.api.Play
import play.api.data.Form
import play.api.data.Forms._
import play.api.db.slick.DatabaseConfigProvider
import scala.concurrent.Future
import slick.driver.JdbcProfile
import slick.driver.MySQLDriver.api._
import scala.concurrent.ExecutionContext.Implicits.global

/**
 * The user object.
 *
 * @param userID The unique ID of the user.
 * @param loginInfo The linked login info.
 * @param firstName Maybe the first name of the authenticated user.
 * @param lastName Maybe the last name of the authenticated user.
 * @param fullName Maybe the full name of the authenticated user.
 * @param email Maybe the email of the authenticated provider.
 * @param avatarURL Maybe the avatar URL of the authenticated provider.
 * @param activated Indicates that the user has activated its registration.
 */
case class User(
  userID: UUID,
  loginInfo: LoginInfo,
  firstName: Option[String],
  lastName: Option[String],
  fullName: Option[String],
  email: Option[String],
  avatarURL: Option[String],
  activated: Boolean) extends Identity {

  /**
   * Tries to construct a name.
   *
   * @return Maybe a name.
   */
  def name = fullName.orElse {
    firstName -> lastName match {
      case (Some(f), Some(l)) => Some(f + " " + l)
      case (Some(f), None) => Some(f)
      case (None, Some(l)) => Some(l)
      case _ => None
    }
  }
}

case class Userdb(
  user_id: Int,
  firstName: String,
  lastName: String,
  email: String,
  password: String

)

object Userdata {

  val form = Form(
    mapping(
      "user_id" -> number,
      "firstName" -> nonEmptyText,
      "lastName" -> nonEmptyText,
      "email" -> nonEmptyText,
      "password" -> nonEmptyText
    )(Userdb.apply)(Userdb.unapply)
  )

}
