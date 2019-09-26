
package models.daos

import javax.inject.Inject
import models.{ Category, Order, Product }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import slick.lifted

import scala.concurrent.{ ExecutionContext, Future }

/**
 * Give access to the user object.
 */
class CategoryDAOImpl @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) extends CategoryDAO {

  val dbConfig = dbConfigProvider.get[JdbcProfile]
  import dbConfig._
  import profile.api._

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

  var categorys = lifted.TableQuery[CategoryTable]

  def add(category: Category): Future[String] = {
    dbConfig.db.run(categorys += category)
    Future.successful("done")
  }

  def list(): Future[Seq[Category]] = db.run {
    categorys.result
  }

}

