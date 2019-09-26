package forms

import play.api.data.Form
import play.api.data.Forms._

/**
 * The form which handles the submission of the credentials.
 */
object OrderForm {

  /**
   * A play framework form.
   */
  val form = Form(
    mapping(
      "user_id" -> number,
      "shippin_adress" -> nonEmptyText
    )(OrderData.apply)(OrderData.unapply)
  )

  /**
   * The form data.
   *
   * @param user_id uo
   * @param shipping_adress yo
   */
  case class OrderData(
    user_id: Int,
    shipping_adress: String
  )
}
