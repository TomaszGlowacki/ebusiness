
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

object user extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreateUserForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: Form[CreateUserForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*3.1*/("""

"""),format.raw/*11.3*/("""

"""),_display_(/*13.2*/main("User")/*13.14*/ {_display_(Seq[Any](format.raw/*13.16*/("""
	"""),_display_(/*14.3*/form(routes.UserController.addUser())/*14.40*/ {_display_(Seq[Any](format.raw/*14.42*/("""
		"""),_display_(/*15.4*/inputText(user("firstname"))),format.raw/*15.32*/("""
		"""),_display_(/*16.4*/inputText(user("middlename"))),format.raw/*16.33*/("""
		"""),_display_(/*17.4*/inputText(user("lastname"))),format.raw/*17.31*/("""
		"""),_display_(/*18.4*/inputText(user("email"))),format.raw/*18.28*/("""
		"""),_display_(/*19.4*/inputText(user("password"))),format.raw/*19.31*/("""

		"""),_display_(/*21.4*/CSRF/*21.8*/.formField),format.raw/*21.18*/("""

		"""),format.raw/*23.3*/("""<div class="buttons">
			<input type="submit" value="Add User"/>
		</div>
	""")))}),format.raw/*26.3*/("""


""")))}),format.raw/*29.2*/("""
"""))
      }
    }
  }

  def render(user:Form[CreateUserForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(user)(request)

  def f:((Form[CreateUserForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (user) => (request) => apply(user)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Sep 22 23:44:56 CEST 2019
                  SOURCE: D:/work/ebusines/proj3/app/views/user.scala.html
                  HASH: 0c0bf1c18bae60e818060d29b7c2337b58f0f1dc
                  MATRIX: 764->2|906->75|950->72|979->168|1008->171|1029->183|1069->185|1098->188|1144->225|1184->227|1214->231|1263->259|1293->263|1343->292|1373->296|1421->323|1451->327|1496->351|1526->355|1574->382|1605->387|1617->391|1648->401|1679->405|1785->481|1819->485
                  LINES: 21->2|24->5|27->3|29->11|31->13|31->13|31->13|32->14|32->14|32->14|33->15|33->15|34->16|34->16|35->17|35->17|36->18|36->18|37->19|37->19|39->21|39->21|39->21|41->23|44->26|47->29
                  -- GENERATED --
              */
          