
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateProductForm],Seq[Category],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(product: Form[CreateProductForm],category: Seq[Category])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
	"""),format.raw/*10.2*/("""<a href="productslist">
		show Products
	</a>
			<br />
	<a href="productform">
		add Products
	</a>
		<br />
	<a href="categorylist">
		show categories
	</a>
				<br />
	<a href="categoryform">
		add Category
	</a>
	<br/>
	<a href="userlist">
		show users
	</a>
		<br />
	<a href="userform">
		add user
	</a>

		<br/>
	<a href="contactlist">
		show opinions
	</a>
		<br />
	<a href="contactform">
		add opinion
	</a>

		<br/>
	<a href="orderlist">
		show orders
	</a>
		<br />
	<a href="orderform">
		add order
	</a>
""")))}),format.raw/*51.2*/("""
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
                  DATE: Mon Sep 23 01:07:10 CEST 2019
                  SOURCE: D:/work/ebusines/proj3/app/views/index.scala.html
                  HASH: 17843b09df0ea113afe9d782cab1a6b34d05ca6f
                  MATRIX: 782->1|954->103|998->101|1025->119|1052->121|1066->128|1099->153|1145->162|1175->167|1190->174|1224->188|1255->190|1283->193|1317->219|1356->221|1385->223|1934->742
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|75->51
                  -- GENERATED --
              */
          