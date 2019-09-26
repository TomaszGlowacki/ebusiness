
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object errorpage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(Error: String)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*3.1*/("""

"""),format.raw/*11.3*/("""

"""),_display_(/*13.2*/main("Category")/*13.18*/ {_display_(Seq[Any](format.raw/*13.20*/("""
	"""),format.raw/*14.2*/("""<h1> Error !!! </h1>
	<p>
		The """),_display_(/*16.8*/Error),format.raw/*16.13*/(""" """),format.raw/*16.14*/("""appears!
	</p>


""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(Error:String,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(Error)(request)

  def f:((String) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (Error) => (request) => apply(Error)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Sep 22 20:19:59 CEST 2019
                  SOURCE: D:/work/ebusines/proj3/app/views/errorpage.scala.html
                  HASH: e8d42d345a50d0f97679f478dd8b629a455fedeb
                  MATRIX: 755->2|884->62|928->59|957->155|986->158|1011->174|1051->176|1080->178|1139->211|1165->216|1194->217|1242->235
                  LINES: 21->2|24->5|27->3|29->11|31->13|31->13|31->13|32->14|34->16|34->16|34->16|38->20
                  -- GENERATED --
              */
          