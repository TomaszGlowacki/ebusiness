package models

import play.api.libs.json._

case class User(user_id: Int, firstname: String, middlename: String,  lastname: String,  email: String,  password: String)

object User {
  implicit val userFormat = Json.format[User]
}
