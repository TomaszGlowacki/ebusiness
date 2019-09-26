package models

import play.api.libs.json._

case class OrderDetails(order_details_id: Int, oder_id: Int, product_id: Int, quantity: Int )

object OrderDetails {
  implicit val orderdetailsFormat = Json.format[OrderDetails]
}
