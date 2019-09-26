
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

object categoryadded extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(categoryadded: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*3.1*/("""

"""),format.raw/*11.3*/("""

"""),_display_(/*13.2*/main("Category Added")/*13.24*/ {_display_(Seq[Any](format.raw/*13.26*/("""

	"""),format.raw/*15.2*/("""<h1>Categorry Added</h1>
	<p>
		The """),_display_(/*17.8*/categoryadded),format.raw/*17.21*/(""" """),format.raw/*17.22*/("""has been added!
	</p>

	<a href="/">
		Return
	</a>

""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(categoryadded:String): play.twirl.api.HtmlFormat.Appendable = apply(categoryadded)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (categoryadded) => apply(categoryadded)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Sep 22 22:57:55 CEST 2019
                  SOURCE: D:/work/ebusines/proj3/app/views/categoryadded.scala.html
                  HASH: 2da715c5dc16bf1237806af3aa642c66c0493736
                  MATRIX: 737->2|833->29|877->26|906->122|935->125|966->147|1006->149|1036->152|1099->189|1133->202|1162->203|1246->257
                  LINES: 21->2|24->5|27->3|29->11|31->13|31->13|31->13|33->15|35->17|35->17|35->17|42->24
                  -- GENERATED --
              */
          