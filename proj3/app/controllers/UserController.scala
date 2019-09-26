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

class UserController @Inject()( userRepo: UserRepository,
            cc: MessagesControllerComponents
            )(implicit ec: ExecutionContext)
    extends MessagesAbstractController(cc) {

  val UserForm: Form[CreateUserForm] = Form {
    mapping(
      "firstname" -> nonEmptyText,
      "middlename" -> nonEmptyText,
      "lastname" -> nonEmptyText,
      "email" -> nonEmptyText,
      "password" -> nonEmptyText
    )(CreateUserForm.apply)(CreateUserForm.unapply)
  }

  def showUserForm = Action { implicit request =>
    Ok(views.html.user(UserForm))
  }

  def addUser = Action.async { implicit request =>
    var a:Seq[User] = Seq[User]()
    val categories = userRepo.list().onComplete{
      case Success(cat) => a= cat
      case Failure(_) => print("fail")
    }
    UserForm.bindFromRequest.fold(
      /*errors => BadRequest(views.html.errorpage("Error")),*/
      errorForm => {
        Future.successful(
          Ok(views.html.errorpage("Error") )
        )
      },
      User => {
        userRepo.create(User.firstname, User.middlename, User.lastname, User.email, User.password ).map { _ =>
        Redirect(routes.UserController.userAdded(User.firstname + " " + User.lastname))
        }
      }
    )
  }

  def userAdded(us: String) = Action{ implicit request =>
    Ok(views.html.useradded(us))
  }

  def getUser = Action.async { implicit request =>
    userRepo.list().map { User =>
      Ok(Json.toJson(User))
    }
  }

}

case class CreateUserForm(firstname: String, middlename: String,  lastname: String,  email: String,  password: String)
