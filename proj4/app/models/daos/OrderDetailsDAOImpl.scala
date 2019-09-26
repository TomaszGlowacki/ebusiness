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
class OrderDetailsDAOImpl @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) extends OrderDetailsDAO {

  val dbConfig = dbConfigProvider.get[JdbcProfile]
  import dbConfig._
  import profile.api._

  class OrderDetailsTable(tag: Tag) extends Table[OrderDetails](tag, "orders_details") {

    /** The ID column, which is the primary key, and auto incremented */
    val order_details_id = column[Int]("order_details_id", O.PrimaryKey, O.AutoInc)

    /** The name column */
    val order_id = column[Int]("order_id")
    val product_id = column[Int]("product_id")
    val quantity = column[Int]("quantity")

    def * = (order_details_id, order_id, product_id, quantity) <> ((OrderDetails.apply _).tupled, OrderDetails.unapply)
  }

  var ordersDetails = lifted.TableQuery[OrderDetailsTable]

  def add(orderdetails: OrderDetails): Future[String] = {
    dbConfig.db.run(ordersDetails += orderdetails)
    Future.successful("done")
  }

}

/**
 * The companion object.
 */
object OrderDetailsDAOImpl {

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
