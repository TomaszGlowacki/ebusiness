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

class CategoryController @Inject()( categoryRepo: CategoryRepository,
            cc: MessagesControllerComponents
            )(implicit ec: ExecutionContext)
    extends MessagesAbstractController(cc) {
  val CategoryForm: Form[CreateCategoryForm] = Form {
    mapping(
      "name" -> nonEmptyText,
      "details" -> nonEmptyText
    )(CreateCategoryForm.apply)(CreateCategoryForm.unapply)
  }

  def showCategoryForm = Action { implicit request =>
    Ok(views.html.category(CategoryForm))
  }

  def addCategory = Action.async { implicit request =>
    var a:Seq[Category] = Seq[Category]()
    val categories = categoryRepo.list().onComplete{
      case Success(cat) => a= cat
      case Failure(_) => print("fail")
    }
    CategoryForm.bindFromRequest.fold(
      /*errors => BadRequest(views.html.errorpage("Error")),*/
      errorForm => {
        Future.successful(
          Ok(views.html.errorpage("Error") )
        )
      },
      Category => {
        categoryRepo.create(Category.name, Category.details ).map { _ =>
        Redirect(routes.CategoryController.CategoryAdded(Category.name))
        }
      }
    )
  }

  def CategoryAdded(cat: String) = Action{ implicit request =>
    Ok(views.html.categoryadded(cat))
  }

  def getCategory = Action.async { implicit request =>
    categoryRepo.list().map { Category =>
      Ok(Json.toJson(Category))
    }
  }

}

case class CreateCategoryForm(name: String, details: String)
