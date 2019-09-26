
package models

import play.api.libs.json._

case class Contact(id: Int, firstname: String, middlename: String,  lastname: String,  message: String,  email: String)

object Contact {
  implicit val ContactFormat = Json.format[Contact]
}
