package models

import com.mohiva.play.silhouette.api.Identity

import play.api.libs.json._

case class Product(
  product_id: Int,
  name: String, description: String, category_id: Int, quantity: Int, price: Int
) extends Identity {

}

object Product {
  implicit val productFormat = Json.format[Product]
}