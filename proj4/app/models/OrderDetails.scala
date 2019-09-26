package models

import java.util.UUID

import com.mohiva.play.silhouette.api.{ Identity, LoginInfo }
import play.api.data.Form
import play.api.data.Forms.{ mapping, _ }

case class OrderDetails(
  order_details_id: Int,
  order_id: Int,
  product_id: Int,
  quantity: Int
) extends Identity {

}
