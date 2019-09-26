package forms

import play.api.data.Form
import play.api.data.Forms._

/**
 * The form which handles the submission of the credentials.
 */
object OrderDetailsForm {

  /**
   * A play framework form.
   */
  val form = Form(
    mapping(
      "order_id" -> number,
      "product_id" -> number,
      "quantity" -> number
    )(OrderDetailsData.apply)(OrderDetailsData.unapply)
  )

  /**
   * The form data.
   *
   * @param order_id The e
   * @param product_id The pa
   * @param quantity Indicat
   */
  case class OrderDetailsData(
    order_id: Int,
    product_id: Int,
    quantity: Int)
}
