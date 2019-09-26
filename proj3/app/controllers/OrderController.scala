package controllers

import javax.inject._
import models._
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.validation.Constraints._
import play.api.i18n._
import play.api.libs.json.Json
import play.api._
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

class OrderController @Inject()( orderRepo: OrderRepository,
                                 orderDetailsRepo: OrderDetailsRepository,
                                 userRepo: UserRepository,
                                 productRepo: ProductRepository,
            cc: MessagesControllerComponents
            )(implicit ec: ExecutionContext)
    extends MessagesAbstractController(cc) {

  val OrderForm: Form[CreateOrderForm] = Form {
    mapping(
      "user_id" -> number,
      "order_id" -> number,
      "product_id" -> number,
      "quantity" -> number,
      "shiping_address" -> nonEmptyText
    )(CreateOrderForm.apply)(CreateOrderForm.unapply)
  }

  def showOrderForm = Action { implicit request =>
    var a:Seq[User] = Seq[User]()
    val users = userRepo.list().onComplete{
      case Success(cat) => a= cat
      case Failure(_) => print("fail")
    }

    var b:Seq[Product] = Seq[Product]()
    val products = productRepo.list().onComplete{
      case Success(cat2) => b= cat2
      case Failure(_) => print("fail")
    }

    Ok(views.html.order(OrderForm, a, b))
  }

  def addOrder = Action.async { implicit request =>
    var a:Seq[User] = Seq[User]()
    val users = userRepo.list().onComplete{
      case Success(cat) => a= cat
      case Failure(_) => print("fail")
    }
    OrderForm.bindFromRequest.fold(
      /*errors => BadRequest(views.html.errorpage("Error")),*/
      errorForm => {
        Future.successful(
          Ok(views.html.errorpage("Error") )
        )
      },
      Order => {
        orderDetailsRepo.create(Order.order_id, Order.product_id, Order.quantity)
        orderRepo.create(Order.user_id, Order.shiping_address ).map { _ =>
        Redirect(routes.OrderController.orderAdded(Order.user_id + " " + Order.shiping_address))
        }
      }
    )
  }

  def orderAdded(Order: String) = Action{ implicit request =>
    Ok(views.html.orderdded(Order))
  }

  def getOrder = Action.async { implicit request =>
    orderRepo.list().map { Order =>
      Ok(Json.toJson(Order))
    }
  }

}

case class CreateOrderForm(user_id: Int, order_id: Int, product_id: Int, quantity: Int, shiping_address: String)


// sil