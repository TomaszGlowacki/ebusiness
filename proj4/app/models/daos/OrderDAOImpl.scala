package models.daos

import java.util.UUID

import com.mohiva.play.silhouette.api.LoginInfo
import models.{ Order, OrderDetails }
import javax.inject.{ Inject, Singleton }
import play.api.data.Form
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.collection.mutable
import scala.concurrent.Future
import scala.concurrent.{ ExecutionContext, Future }
import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import play.api.libs.json._

import scala.concurrent.{ ExecutionContext, Future }
import javax.inject._
import models._
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.validation.Constraints._
import play.api.i18n._
import play.api.libs.json.Json
import play.api._
import play.api.mvc._
import play.api.Play
import play.api.data.Form
import play.api.data.Forms._
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import slick.lifted
import slick.lifted.{ TableQuery, Tag }
import slick.relational.RelationalProfile._

import scala.concurrent.ExecutionContext.Implicits.global

/**
 * Give access to the user object.
 */
class OrderDAOImpl @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) extends OrderDAO {

  val dbConfig = dbConfigProvider.get[JdbcProfile]
  import dbConfig._
  import profile.api._

  class OrderTable(tag: Tag) extends Table[Order](tag, "orders") {

    /** The ID column, which is the primary key, and auto incremented */
    val order_id = column[Int]("order_id", O.PrimaryKey, O.AutoInc)
    /** The name column */
    val user_id = column[Int]("user_id")

    val shipping_adress = column[String]("shipping_adress")

    def * = (order_id, user_id, shipping_adress) <> ((Order.apply _).tupled, Order.unapply)
  }

  var orders = lifted.TableQuery[OrderTable]

  def add(order: Order): Future[String] = {
    dbConfig.db.run(orders += order)
    Future.successful("done")
  }

}

/**
 * The companion object.
 */
object OrderDAOImpl {

  /**
   * The list of users.
   */

  //val dbConfig = DatabaseConfigProvider.get[JdbcProfile](Play.current)

  //  import dbConfig._
  //  import profile.api._
  //
  //  def add(user22: Userdb): Future[String] = {
  //    dbConfig.db.run(usersdb += user22).map(res => "User successfully added").recover {
  //      case ex: Exception => ex.getCause.getMessage
  //    }
  //  }

}
