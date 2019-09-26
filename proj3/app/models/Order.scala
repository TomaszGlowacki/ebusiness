package models

import play.api.libs.json._

case class Order(id: Int, user_id: Int, shiping_address: String )

object Order {
  implicit val orderFormat = Json.format[Order]
}
