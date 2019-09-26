package controllers

import com.mohiva.play.silhouette.api.actions.SecuredRequest
import com.mohiva.play.silhouette.api.repositories.AuthInfoRepository
import com.mohiva.play.silhouette.api.{ LogoutEvent, Silhouette }
import com.mohiva.play.silhouette.impl.providers.GoogleTotpInfo
import javax.inject.Inject
import models.Product
import models.daos.ProductDAOImpl
import org.webjars.play.WebJarsUtil
import play.api.i18n.I18nSupport
import play.api.mvc.{ AbstractController, AnyContent, ControllerComponents }
import utils.auth.DefaultEnv

import scala.concurrent.ExecutionContext

import play.api.data.Form
import play.api.data.Forms._
import play.api.data.validation.Constraints._
import play.api.i18n._
import play.api.libs.json.Json
import play.api.mvc._

import javax.inject._
import models._
import models.daos
import models.daos.{ CategoryDAOImpl, ProductDAOImpl }
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.validation.Constraints._
import play.api.i18n._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.{ ExecutionContext, Future }
import scala.util.{ Failure, Success }

class ProductController @Inject() (productsRepo: ProductDAOImpl, categoryRepo: CategoryDAOImpl,
  cc: MessagesControllerComponents)(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  /**
   * The mapping for the person form.
   */
  val productForm: Form[CreateProductForm] = Form {
    mapping(
      "name" -> nonEmptyText,
      "description" -> nonEmptyText,
      "category_id" -> number,
      "quantity" -> number,
      "price" -> number
    )(CreateProductForm.apply)(CreateProductForm.unapply)
  }

  /**
   * The index action.
   */
  //  def index = Action.async { implicit request =>
  //    val categories = categoryRepo.list()
  //    categories.map(cat => Ok(views.html.index(productForm,cat)))
  //
  //    /*
  //    .onComplete{
  //    case Success(categories) => Ok(views.html.index(productForm,categories))
  //    case Failure(t) => print("")
  //  }*/
  //  }

  /**
   * The add person action.
   *
   * This is asynchronous, since we're invoking the asynchronous methods on PersonRepository.
   */
  /*
    def addProduct = Action.async { implicit request =>
      Ok(views.html.addproduct())
    }
  */
  //  def showProductForm = Action { implicit request =>
  //    var a:Seq[Category] = Seq[Category]()
  //    val categories = categoryRepo.list().onComplete{
  //      case Success(cat) => a= cat
  //      case Failure(_) => print("fail")
  //    }
  //    Ok(views.html.producsts(productForm, a))
  //  }

  //  def addProduct = Action.async { implicit request =>
  //    // Bind the form first, then fold the result, passing a function to handle errors, and a function to handle succes.
  //    var a:Seq[Category] = Seq[Category]()
  //    val categories = categoryRepo.list().onComplete{
  //      case Success(cat) => a= cat
  //      case Failure(_) => print("fail")
  //    }
  //
  //    productForm.bindFromRequest.fold(
  //      // The error function. We return the index page with the error form, which will render the errors.
  //      // We also wrap the result in a successful future, since this action is synchronous, but we're required to return
  //      // a future because the person creation function returns a future.
  //      errorForm => {
  //        Future.successful(
  //          Ok(views.html.index(errorForm,a))
  //        )
  //      },
  //      // There were no errors in the from, so create the person.
  //      product => {
  //        productsRepo.create(product.name, product.description, product.category_id ,product.quantity, product.price).map { _ =>
  //          // If successful, we simply redirect to the index page.
  //          Redirect(routes.ProductController.index).flashing("success" -> "product.created")
  //        }
  //      }
  //    )
  //  }

  /**
   * A REST endpoint that gets all the people as JSON.
   */
  //  def getProduct = ssilhouette.SecuredAction.async { implicit request =>
  //    productsRepo.list().map { products =>
  //      Ok(Json.toJson(products))
  //    }
  //  }
}

/**
 * The create person form.
 *
 * Generally for forms, you should define separate objects to your models, since forms very often need to present data
 * in a different way to your models.  In this case, it doesn't make sense to have an id parameter in the form, since
 * that is generated once it's created.
 */
case class CreateProductForm(name: String, description: String, category_id: Int, quantity: Int, price: Int)
