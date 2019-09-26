
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

object contact extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreateContactForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(Contact: Form[CreateContactForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*3.1*/("""

"""),format.raw/*11.3*/("""

"""),_display_(/*13.2*/main("Opinion")/*13.17*/ {_display_(Seq[Any](format.raw/*13.19*/("""
	"""),_display_(/*14.3*/form(routes.ContactController.addContact())/*14.46*/ {_display_(Seq[Any](format.raw/*14.48*/("""
		"""),_display_(/*15.4*/inputText(Contact("firstname"))),format.raw/*15.35*/("""
		"""),_display_(/*16.4*/inputText(Contact("middlename"))),format.raw/*16.36*/("""
		"""),_display_(/*17.4*/inputText(Contact("lastname"))),format.raw/*17.34*/("""
		"""),_display_(/*18.4*/textarea(Contact("message"))),format.raw/*18.32*/("""
		"""),_display_(/*19.4*/inputText(Contact("email"))),format.raw/*19.31*/("""


		"""),_display_(/*22.4*/CSRF/*22.8*/.formField),format.raw/*22.18*/("""

		"""),format.raw/*24.3*/("""<div class="buttons">
			<input type="submit" value="Add Opinion"/>
		</div>
	""")))}),format.raw/*27.3*/("""


""")))}),format.raw/*30.2*/("""
"""))
      }
    }
  }

  def render(Contact:Form[CreateContactForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(Contact)(request)

  def f:((Form[CreateContactForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (Contact) => (request) => apply(Contact)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 23 00:40:58 CEST 2019
                  SOURCE: D:/work/ebusines/proj3/app/views/contact.scala.html
                  HASH: efe357e4036db7d5164bb53de5a75ef16bb5ee29
                  MATRIX: 770->2|918->81|962->78|991->174|1020->177|1044->192|1084->194|1113->197|1165->240|1205->242|1235->246|1287->277|1317->281|1370->313|1400->317|1451->347|1481->351|1530->379|1560->383|1608->410|1640->416|1652->420|1683->430|1714->434|1823->513|1857->517
                  LINES: 21->2|24->5|27->3|29->11|31->13|31->13|31->13|32->14|32->14|32->14|33->15|33->15|34->16|34->16|35->17|35->17|36->18|36->18|37->19|37->19|40->22|40->22|40->22|42->24|45->27|48->30
                  -- GENERATED --
              */
          