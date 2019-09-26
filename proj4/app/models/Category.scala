package models

import com.mohiva.play.silhouette.api.Identity
import play.api.data.Form
import play.api.data.Forms.mapping

case class Category(id: Int, name: String, details: String)
  extends Identity {

}
