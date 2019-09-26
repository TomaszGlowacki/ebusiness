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

class ContactController @Inject()( contactRepo: ContactRepository,
            cc: MessagesControllerComponents
            )(implicit ec: ExecutionContext)
    extends MessagesAbstractController(cc) {

  val ContactForm: Form[CreateContactForm] = Form {
    mapping(
      "firstname" -> nonEmptyText,
      "middlename" -> nonEmptyText,
      "lastname" -> nonEmptyText,
      "message" -> nonEmptyText,
      "email" -> nonEmptyText
    )(CreateContactForm.apply)(CreateContactForm.unapply)
  }

  def showContactForm = Action { implicit request =>
    Ok(views.html.contact(ContactForm))
  }

  def addContact = Action.async { implicit request =>
    var a:Seq[Contact] = Seq[Contact]()
    val categories = contactRepo.list().onComplete{
      case Success(cat) => a= cat
      case Failure(_) => print("fail")
    }
    ContactForm.bindFromRequest.fold(
      /*errors => BadRequest(views.html.errorpage("Error")),*/
      errorForm => {
        Future.successful(
          Ok(views.html.errorpage("Error") )
        )
      },
      Contact => {
        contactRepo.create(Contact.firstname, Contact.middlename, Contact.lastname, Contact.message, Contact.email ).map { _ =>
        Redirect(routes.ContactController.contactAdded(Contact.firstname + " " + Contact.lastname))
        }
      }
    )
  }

  def contactAdded(us: String) = Action{ implicit request =>
    Ok(views.html.contactadded(us))
  }

  def getContact = Action.async { implicit request =>
    contactRepo.list().map { Contact =>
      Ok(Json.toJson(Contact))
    }
  }

}

case class CreateContactForm(firstname: String, middlename: String,  lastname: String,  message: String, email: String)
