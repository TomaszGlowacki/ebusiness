
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

object producsts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateProductForm],Seq[Category],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(product: Form[CreateProductForm], category: Seq[Category])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
  """),_display_(/*10.4*/form(routes.ProductController.addProduct())/*10.47*/ {_display_(Seq[Any](format.raw/*10.49*/("""
		"""),_display_(/*11.4*/inputText(product("name"))),format.raw/*11.30*/("""
		"""),_display_(/*12.4*/inputText(product("description"))),format.raw/*12.37*/("""
	  	"""),_display_(/*13.6*/inputText(product("quantity"))),format.raw/*13.36*/("""
	  	"""),_display_(/*14.6*/inputText(product("price"))),format.raw/*14.33*/("""

	  """),format.raw/*16.4*/("""<select name="category_id" id="category_id">
		"""),_display_(/*17.4*/for(cat <- category) yield /*17.24*/{_display_(Seq[Any](format.raw/*17.25*/("""
			"""),format.raw/*18.4*/("""<option value=""""),_display_(/*18.20*/cat/*18.23*/.id),format.raw/*18.26*/("""">"""),_display_(/*18.29*/cat/*18.32*/.name),format.raw/*18.37*/("""</option>
		""")))}),format.raw/*19.4*/("""
	  """),format.raw/*20.4*/("""</select>


		"""),_display_(/*23.4*/CSRF/*23.8*/.formField),format.raw/*23.18*/("""

		"""),format.raw/*25.3*/("""<div class="buttons">
			<input type="submit" value="Add Product"/>
		</div>
	""")))}),format.raw/*28.3*/("""
""")))}),format.raw/*29.2*/("""
"""))
      }
    }
  }

  def render(product:Form[CreateProductForm],category:Seq[Category],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(product,category)(request)

  def f:((Form[CreateProductForm],Seq[Category]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (product,category) => (request) => apply(product,category)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 23 01:59:46 CEST 2019
                  SOURCE: D:/work/ebusines/proj3/app/views/producsts.scala.html
                  HASH: 64ea667105334144a9dccf705d39eb3d3613112d
                  MATRIX: 786->1|959->104|1003->102|1030->120|1057->122|1071->129|1104->154|1150->163|1180->168|1195->175|1229->189|1260->191|1288->194|1322->220|1361->222|1391->226|1443->269|1483->271|1513->275|1560->301|1590->305|1644->338|1676->344|1727->374|1759->380|1807->407|1839->412|1913->460|1949->480|1988->481|2019->485|2062->501|2074->504|2098->507|2128->510|2140->513|2166->518|2209->531|2240->535|2281->550|2293->554|2324->564|2355->568|2464->647|2496->649
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|36->12|36->12|37->13|37->13|38->14|38->14|40->16|41->17|41->17|41->17|42->18|42->18|42->18|42->18|42->18|42->18|42->18|43->19|44->20|47->23|47->23|47->23|49->25|52->28|53->29
                  -- GENERATED --
              */
          