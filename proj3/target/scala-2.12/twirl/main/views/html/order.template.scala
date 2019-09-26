
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

object order extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[CreateOrderForm],Seq[User],Seq[Product],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(Order: Form[CreateOrderForm], users: Seq[User], products: Seq[Product])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*3.1*/("""

"""),format.raw/*11.3*/("""

"""),_display_(/*13.2*/main("Order")/*13.15*/ {_display_(Seq[Any](format.raw/*13.17*/("""
	"""),_display_(/*14.3*/form(routes.OrderController.addOrder())/*14.42*/ {_display_(Seq[Any](format.raw/*14.44*/("""
		"""),format.raw/*15.3*/("""user:
		<select name="user_id" id="user_id">
		"""),_display_(/*17.4*/for(user <- users) yield /*17.22*/{_display_(Seq[Any](format.raw/*17.23*/("""
			"""),format.raw/*18.4*/("""<option value=""""),_display_(/*18.20*/user/*18.24*/.user_id),format.raw/*18.32*/("""">"""),_display_(/*18.35*/user/*18.39*/.firstname),format.raw/*18.49*/(""" """),_display_(/*18.51*/user/*18.55*/.lastname),format.raw/*18.64*/("""</option>
		""")))}),format.raw/*19.4*/("""
		"""),format.raw/*20.3*/("""</select>

		<select name="product_id" id="product_id">
		"""),_display_(/*23.4*/for(product <- products) yield /*23.28*/{_display_(Seq[Any](format.raw/*23.29*/("""
			"""),format.raw/*24.4*/("""<option value=""""),_display_(/*24.20*/product/*24.27*/.id),format.raw/*24.30*/("""">"""),_display_(/*24.33*/product/*24.40*/.name),format.raw/*24.45*/("""</option>
		""")))}),format.raw/*25.4*/("""
		"""),format.raw/*26.3*/("""</select>

		"""),_display_(/*28.4*/inputText(Order("quantity"))),format.raw/*28.32*/("""

		"""),_display_(/*30.4*/inputText(Order("shiping_address"))),format.raw/*30.39*/("""


		"""),_display_(/*33.4*/CSRF/*33.8*/.formField),format.raw/*33.18*/("""

		"""),format.raw/*35.3*/("""<div class="buttons">
			<input type="submit" value="Order"/>
		</div>
	""")))}),format.raw/*38.3*/("""


""")))}),format.raw/*41.2*/("""
"""))
      }
    }
  }

  def render(Order:Form[CreateOrderForm],users:Seq[User],products:Seq[Product],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(Order,users,products)(request)

  def f:((Form[CreateOrderForm],Seq[User],Seq[Product]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (Order,users,products) => (request) => apply(Order,users,products)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 23 16:59:55 CEST 2019
                  SOURCE: D:/work/ebusines/proj3/app/views/order.scala.html
                  HASH: c81b5b50c79fab2aca8ae34abc211b0cfbb5b86b
                  MATRIX: 789->2|975->119|1019->116|1048->212|1077->215|1099->228|1139->230|1168->233|1216->272|1256->274|1286->277|1360->325|1394->343|1433->344|1464->348|1507->364|1520->368|1549->376|1579->379|1592->383|1623->393|1652->395|1665->399|1695->408|1738->421|1768->424|1853->483|1893->507|1932->508|1963->512|2006->528|2022->535|2046->538|2076->541|2092->548|2118->553|2161->566|2191->569|2231->583|2280->611|2311->616|2367->651|2399->657|2411->661|2442->671|2473->675|2576->748|2610->752
                  LINES: 21->2|24->5|27->3|29->11|31->13|31->13|31->13|32->14|32->14|32->14|33->15|35->17|35->17|35->17|36->18|36->18|36->18|36->18|36->18|36->18|36->18|36->18|36->18|36->18|37->19|38->20|41->23|41->23|41->23|42->24|42->24|42->24|42->24|42->24|42->24|42->24|43->25|44->26|46->28|46->28|48->30|48->30|51->33|51->33|51->33|53->35|56->38|59->41
                  -- GENERATED --
              */
          