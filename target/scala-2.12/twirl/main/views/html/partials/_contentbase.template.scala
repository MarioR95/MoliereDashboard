
package views.html.partials

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
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object _contentbase extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.dto.UserDto,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.dto.UserDto, contentType: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.49*/("""
"""),format.raw/*2.1*/("""<!-- begin:: Content -->
<div class="kt-content kt-grid__item kt-grid__item--fluid" id="kt_content" >

	"""),_display_(/*5.3*/contentType/*5.14*/ match/*5.20*/{/*6.3*/case "dashWidget" =>/*6.23*/ {_display_(Seq[Any](format.raw/*6.25*/("""
			"""),_display_(/*7.5*/views/*7.10*/.html.tdashwidgetcontent()),format.raw/*7.36*/("""
		""")))}/*9.3*/case "dashboard" =>/*9.22*/ {_display_(Seq[Any](format.raw/*9.24*/("""
			"""),_display_(/*10.5*/views/*10.10*/.html.sdashwidgetcontent(user)),format.raw/*10.40*/("""
		""")))}/*12.3*/case "courseDetails" =>/*12.26*/ {_display_(Seq[Any](format.raw/*12.28*/("""
			"""),_display_(/*13.5*/{ if (user.getRole() ==  1)
				views.html.tcoursedetailscontent()
			else
				views.html.scoursedetailscontent(user)
	
			}),format.raw/*18.5*/("""
		""")))}/*20.3*/case "studentStats" =>/*20.25*/ {_display_(Seq[Any](format.raw/*20.27*/("""
			"""),_display_(/*21.5*/views/*21.10*/.html.studentStats()),format.raw/*21.30*/("""
		""")))}/*23.3*/case _ =>/*23.12*/ {}}),format.raw/*24.3*/("""
	
"""),format.raw/*26.1*/("""</div>
<!-- end:: Content -->"""))
      }
    }
  }

  def render(user:models.dto.UserDto,contentType:String): play.twirl.api.HtmlFormat.Appendable = apply(user,contentType)

  def f:((models.dto.UserDto,String) => play.twirl.api.HtmlFormat.Appendable) = (user,contentType) => apply(user,contentType)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jul 29 09:44:00 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/partials/_contentbase.scala.html
                  HASH: 7aaf5c9879fd410a580aa17040633596cce89cff
                  MATRIX: 983->1|1125->48|1153->50|1286->158|1305->169|1319->175|1327->180|1355->200|1394->202|1425->208|1438->213|1484->239|1506->248|1533->267|1572->269|1604->275|1618->280|1669->310|1692->319|1724->342|1764->344|1796->350|1945->479|1968->488|1999->510|2039->512|2071->518|2085->523|2126->543|2149->552|2167->561|2191->568|2223->573
                  LINES: 28->1|33->1|34->2|37->5|37->5|37->5|37->6|37->6|37->6|38->7|38->7|38->7|39->9|39->9|39->9|40->10|40->10|40->10|41->12|41->12|41->12|42->13|47->18|48->20|48->20|48->20|49->21|49->21|49->21|50->23|50->23|50->24|52->26
                  -- GENERATED --
              */
          