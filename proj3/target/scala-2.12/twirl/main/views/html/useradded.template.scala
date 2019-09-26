
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

object useradded extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(Useradd: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*3.1*/("""

"""),format.raw/*11.3*/("""

"""),_display_(/*13.2*/main("User Added")/*13.20*/ {_display_(Seq[Any](format.raw/*13.22*/("""

	"""),format.raw/*15.2*/("""<h1>User Added</h1>
	<p>
		The """),_display_(/*17.8*/Useradd),format.raw/*17.15*/(""" """),format.raw/*17.16*/("""has been added!
	</p>

	<a href="/">
		Return
	</a>

""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(Useradd:String): play.twirl.api.HtmlFormat.Appendable = apply(Useradd)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (Useradd) => apply(Useradd)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Sep 22 22:57:55 CEST 2019
                  SOURCE: D:/work/ebusines/proj3/app/views/useradded.scala.html
                  HASH: 92e74047873bfe3b3a01b3abf56c99605fa853f4
                  MATRIX: 733->2|823->23|867->20|896->116|925->119|952->137|992->139|1022->142|1080->174|1108->181|1137->182|1221->236
                  LINES: 21->2|24->5|27->3|29->11|31->13|31->13|31->13|33->15|35->17|35->17|35->17|42->24
                  -- GENERATED --
              */
          