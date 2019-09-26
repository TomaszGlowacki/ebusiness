
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

object category extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreateCategoryForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(category: Form[CreateCategoryForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*3.1*/("""

"""),format.raw/*11.3*/("""

"""),_display_(/*13.2*/main("Category")/*13.18*/ {_display_(Seq[Any](format.raw/*13.20*/("""
	"""),_display_(/*14.3*/form(routes.CategoryController.addCategory())/*14.48*/ {_display_(Seq[Any](format.raw/*14.50*/("""
		"""),_display_(/*15.4*/inputText(category("name"))),format.raw/*15.31*/("""
		"""),_display_(/*16.4*/inputText(category("details"))),format.raw/*16.34*/("""


		"""),_display_(/*19.4*/CSRF/*19.8*/.formField),format.raw/*19.18*/("""

		"""),format.raw/*21.3*/("""<div class="buttons">
			<input type="submit" value="Add Category"/>
		</div>
	""")))}),format.raw/*24.3*/("""


""")))}),format.raw/*27.2*/("""
"""))
      }
    }
  }

  def render(category:Form[CreateCategoryForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(category)(request)

  def f:((Form[CreateCategoryForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (category) => (request) => apply(category)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Sep 22 20:19:59 CEST 2019
                  SOURCE: D:/work/ebusines/proj3/app/views/category.scala.html
                  HASH: eef89700c513a97255266e63c27c95539947e492
                  MATRIX: 772->2|922->83|966->80|995->176|1024->179|1049->195|1089->197|1118->200|1172->245|1212->247|1242->251|1290->278|1320->282|1371->312|1403->318|1415->322|1446->332|1477->336|1587->416|1621->420
                  LINES: 21->2|24->5|27->3|29->11|31->13|31->13|31->13|32->14|32->14|32->14|33->15|33->15|34->16|34->16|37->19|37->19|37->19|39->21|42->24|45->27
                  -- GENERATED --
              */
          