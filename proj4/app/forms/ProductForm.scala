package forms

import play.api.data.Form
import play.api.data.Forms._

/**
 * The form which handles the submission of the credentials.
 */
object ProductForm {

  /**
   * A play framework form.
   */
  val form = Form(
    mapping(
      "name" -> nonEmptyText,
      "description" -> nonEmptyText,
      "category_id" -> number,
      "quantity" -> number,
      "price" -> number
    )(ProductForm.apply)(ProductForm.unapply)
  )

  case class ProductForm(name: String, description: String, category_id: Int, quantity: Int, price: Int)
}
