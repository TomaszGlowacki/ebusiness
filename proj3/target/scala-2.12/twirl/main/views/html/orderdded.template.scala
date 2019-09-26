
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

object orderdded extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(Orderadd: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*3.1*/("""

"""),format.raw/*11.3*/("""

"""),_display_(/*13.2*/main("Order Added")/*13.21*/ {_display_(Seq[Any](format.raw/*13.23*/("""

	"""),format.raw/*15.2*/("""<h1>Order Added</h1>
	<p>
		The """),_display_(/*17.8*/Orderadd),format.raw/*17.16*/(""" """),format.raw/*17.17*/("""has been added!
	</p>

	<a href="/">
		Return
	</a>

""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(Orderadd:String): play.twirl.api.HtmlFormat.Appendable = apply(Orderadd)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (Orderadd) => apply(Orderadd)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 23 01:01:00 CEST 2019
                  SOURCE: D:/work/ebusines/proj3/app/views/orderdded.scala.html
                  HASH: 40988d0032b79319157278a70617cba829cd370e
                  MATRIX: 733->2|824->24|868->21|897->117|926->120|954->139|994->141|1024->144|1083->177|1112->185|1141->186|1225->240
                  LINES: 21->2|24->5|27->3|29->11|31->13|31->13|31->13|33->15|35->17|35->17|35->17|42->24
                  -- GENERATED --
              */
          