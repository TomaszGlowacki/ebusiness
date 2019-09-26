package models.daos

import models.{ Category, Product }

import scala.concurrent.Future

/**
 * Give access to the user object.
 */
trait CategoryDAO {

  def add(product: Category): Future[String]

  def list(): Future[Seq[Category]]

}
