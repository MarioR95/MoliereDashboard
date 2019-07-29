
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
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object studentStats extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!-- begin: Content -->
<div class="row">
	<!-- begin: first widget -->
	<div class="col-xl-12">
		<div class="kt-portlet">
			<div class="kt-portlet__head">
				<div class="kt-portlet__head-label">
					<span class="kt-portlet__head-icon kt-hidden"> <i
						class="la la-gear"></i>
					</span>
					<h3 class="kt-portlet__head-title">Temporal view of Motivation and Engagement</h3>
				</div>
			</div>
			<div class="kt-portlet__body">
				<div id="kt_flotcharts" style="height: 400px; padding: 0px; position: relative;">
					<canvas class="flot-base" style="direction: ltr; position: absolute; left: 0px; top: 0px; width: 1538px; height: 300px;" width="1538" height="300"></canvas>
					<canvas class="flot-overlay" width="1538" height="300" style="direction: ltr; position: absolute; left: 0px; top: 0px; width: 1538px; height: 300px;"></canvas>
					<div class="legend">
						<div style="position: absolute; width: 85px; height: 36px; top: 13px; right: 12px; background-color: rgb(255, 255, 255); opacity: 0.85;">
						</div>
						<table style="position: absolute; top: 13px; right: 12px;; font-size: smaller; color: #545454">
							<tbody>
								<tr>
									<td class="legendColorBox">
										<div style="border: 1px solid #ccc; padding: 1px">
										<div style="width: 4px; height: 0; border: 5px solid rgb(93, 120, 255); overflow: hidden"></div>
										</div>
									</td>
									<td class="legendLabel">Motivation</td>
								</tr>
								<tr>
									<td class="legendColorBox"><div style="border: 1px solid #ccc; padding: 1px">
										<div style="width: 4px; height: 0; border: 5px solid rgb(253, 57, 149); overflow: hidden"></div>
										</div>
									</td>
									<td class="legendLabel">Engagement</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- end: first widget -->
</div>

<!-- begin: Student table -->
<div class="row">
	<div class="col-xl-12">
		<div class="kt-portlet">
			<div class="kt-portlet__body">
				<!--begin::Section-->
				<div class="kt-section">
					<div class="kt-section__content">
						<table class="table table-hover" style="text-align: center;">
						  	<thead class="thead-dark">
						    	<tr>
						      		<th>Week of Measure</th>
						      		<th>Start</th>
						      		<th>End</th>
						      		<th>Motivation</th>
						      		<th>Engagement</th>
						      		<th colspan="2">Student Feedback</th>
						      		<th colspan="2">Teacher Feedback</th>
						      		<th>Actions</th>
						    	</tr>
						  	</thead>
						  	<tbody id="tbody-measures" class="tbody-dark">
							
						  	</tbody>
						</table>
					</div>
				</div>
				<!--end::Section-->
			</div>
		</div>
	</div>
</div>
<!-- end: Student table -->

<!-- begin: FCM Representation -->
<div class="row" id="fcm_container" style="display:none">
	<div class="col-xl-12">
		<div class="kt-portlet">
			<div id= "fcm-header" class="kt-portlet__head">
				<div class="kt-portlet__head-label">
					<span class="kt-portlet__head-icon kt-hidden"> <i
						class="la la-gear"></i>
					</span>
					<h3 id="head-table-measurement"class="kt-portlet__head-title"></h3>
				</div>
				<div class="kt-portlet__head-toolbar">
					<div class="kt-portlet__head-actions">
						<button id="prev" type="button" class="btn btn-secondary" onclick="prevDataset()"><i class="fas fa-arrow-left"></i> Previous Interaction</button>
						<button id="next" type="button" class="btn btn-secondary" onclick="nextDataset()">Next Interaction <i class="fas fa-arrow-right"></i></button>
					</div>
				</div>
			</div>
			<div class="kt-portlet__body">
				<div id="fcm" style="height: 700px;">
				</div>
			</div>
		</div>
	</div>
</div>
<!-- end: FCM Representation -->

<!-- end: Content -->"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jul 29 09:44:00 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/studentStats.scala.html
                  HASH: 5b859a8d886a77becb092d5a78a79bab36ea539d
                  MATRIX: 1037->2
                  LINES: 33->2
                  -- GENERATED --
              */
          