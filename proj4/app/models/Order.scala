package models

import java.util.UUID
import java.util.concurrent.Future

import com.mohiva.play.silhouette.api.{ Identity, LoginInfo }
import play.api.Play
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import slick.lifted.TableQuery
import play.api.data.Form
import play.api.data.Forms.mapping

import play.api.Play
import play.api.data.Form
import play.api.data.Forms._
import play.api.db.slick.DatabaseConfigProvider
import scala.concurrent.Future
import slick.driver.JdbcProfile
import slick.driver.MySQLDriver.api._
import scala.concurrent.ExecutionContext.Implicits.global

case class Order(
  order_id: Int,
  user_id: Int,
  shipping_adress: String
) extends Identity {

}
