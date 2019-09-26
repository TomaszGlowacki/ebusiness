package models.daos

import models.OrderDetails

import scala.concurrent.Future

/**
 * Give access to the user object.
 */
trait OrderDetailsDAO {

  def add(order: OrderDetails): Future[String]

}
