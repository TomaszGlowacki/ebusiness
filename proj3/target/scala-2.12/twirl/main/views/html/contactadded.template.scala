
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

object contactadded extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(Contactadd: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*3.1*/("""

"""),format.raw/*11.3*/("""

"""),_display_(/*13.2*/main("Opinion Added")/*13.23*/ {_display_(Seq[Any](format.raw/*13.25*/("""

	"""),format.raw/*15.2*/("""<h1>Contact Added</h1>
	<p>
		The """),_display_(/*17.8*/Contactadd),format.raw/*17.18*/(""" """),format.raw/*17.19*/(""", thank you for your opinion!
	</p>

	<a href="/">
		Return
	</a>

""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(Contactadd:String): play.twirl.api.HtmlFormat.Appendable = apply(Contactadd)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (Contactadd) => apply(Contactadd)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Sep 22 23:53:19 CEST 2019
                  SOURCE: D:/work/ebusines/proj3/app/views/contactadded.scala.html
                  HASH: 3d6a7e69b30c328e38ebdf9d032d78e3f06a3d2e
                  MATRIX: 736->2|829->26|873->23|902->119|931->122|961->143|1001->145|1031->148|1092->183|1123->193|1152->194|1250->262
                  LINES: 21->2|24->5|27->3|29->11|31->13|31->13|31->13|33->15|35->17|35->17|35->17|42->24
                  -- GENERATED --
              */
          