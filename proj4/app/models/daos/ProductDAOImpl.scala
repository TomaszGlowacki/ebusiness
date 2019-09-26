package models.daos

import javax.inject.Inject
import models.{ Category, Product }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import slick.lifted

import scala.concurrent.{ ExecutionContext, Future }

/**
 * Give access to the user object.
 */
class ProductDAOImpl @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) extends ProductDAO {

  val dbConfig = dbConfigProvider.get[JdbcProfile]
  import dbConfig._
  import profile.api._

  class ProductTable(tag: Tag) extends Table[Product](tag, "product") {

    /** The ID column, which is the primary key, and auto incremented */
    def product_id = column[Int]("product_id", O.PrimaryKey, O.AutoInc)

    /** The name column */
    def name = column[String]("name")

    /** The age column */
    def description = column[String]("description")

    def category_id = column[Int]("category_id")

    def quantity = column[Int]("quantity")

    def price = column[Int]("price")

    def category_fk = foreignKey("cat_fk", category_id, cat)(_.id)

    def * = (product_id, name, description, category_id, quantity, price) <> ((Product.apply _).tupled, Product.unapply)
    //def * = (id, name) <> ((Category.apply _).tupled, Category.unapply)
  }

  class CategoryTable(tag: Tag) extends Table[Category](tag, "category") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)

    /** The name column */
    def name = column[String]("name")

    def details = column[String]("details")
    /**
     * This is the tables default "projection".
     *
     * It defines how the columns are converted to and from the Person object.
     *
     * In this case, we are simply passing the id, name and page parameters to the Person case classes
     * apply and unapply methods.
     */
    def * = (id, name, details) <> ((Category.apply _).tupled, Category.unapply)
  }

  var products = lifted.TableQuery[ProductTable]

  val cat = TableQuery[CategoryTable]

  def add(product: Product): Future[String] = {
    dbConfig.db.run(products += product)
    Future.successful("done")
  }

  def list(): Future[Seq[Product]] = {
    dbConfig.db.run(products.result)
  }

}
