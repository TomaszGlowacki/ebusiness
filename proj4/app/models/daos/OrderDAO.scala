package models.daos

import java.util.UUID

import com.mohiva.play.silhouette.api.LoginInfo
import models.{ Order, OrderDetails }

import scala.concurrent.Future

/**
 * Give access to the user object.
 */
trait OrderDAO {

  def add(order: Order): Future[String]

}
