package models.daos

import models.{ Order, Product }

import scala.concurrent.Future

/**
 * Give access to the user object.
 */
trait ProductDAO {

  def add(product: Product): Future[String]

  def list(): Future[Seq[Product]]

}
