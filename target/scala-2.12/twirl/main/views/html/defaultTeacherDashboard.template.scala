
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

object defaultTeacherDashboard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div class="kt-portlet">
	<div class="kt-portlet__body  kt-portlet__body--fit">
		<div class="row row-no-padding row-col-separator-xl">
			<div class="col-xl-4">
				<!--begin:: Widgets/Daily Sales-->
<div class="kt-portlet kt-portlet--height-fluid">
	<div class="kt-widget14">
		<div class="kt-widget14__header kt-margin-b-30">
			<h3 class="kt-widget14__title">
				Daily Sales              
			</h3>
			<span class="kt-widget14__desc">
				Check out each collumn for more details
			</span>
		</div>
		<div class="kt-widget14__chart" style="height:120px;"><div class="chartjs-size-monitor"><div class="chartjs-size-monitor-expand"><div class=""></div></div><div class="chartjs-size-monitor-shrink"><div class=""></div></div></div>
			<canvas id="kt_chart_daily_sales" style="display: block; width: 478px; height: 120px;" width="478" height="120" class="chartjs-render-monitor"></canvas>
		</div>
	</div>
</div>	
<!--end:: Widgets/Daily Sales-->			</div>
			<div class="col-xl-4">
				<!--begin:: Widgets/Profit Share-->
<div class="kt-portlet kt-portlet--height-fluid">
	<div class="kt-widget14">
		<div class="kt-widget14__header">
			<h3 class="kt-widget14__title">
				Profit Share            
			</h3>
			<span class="kt-widget14__desc">
				Profit Share between customers
			</span>
		</div>	 
		<div class="kt-widget14__content">	
			<div class="kt-widget14__chart"><div class="chartjs-size-monitor"><div class="chartjs-size-monitor-expand"><div class=""></div></div><div class="chartjs-size-monitor-shrink"><div class=""></div></div></div>
				<div class="kt-widget14__stat">45</div>
				<canvas id="kt_chart_profit_share" style="height: 140px; width: 140px; display: block;" width="140" height="140" class="chartjs-render-monitor"></canvas>
			</div> 
			<div class="kt-widget14__legends">
				<div class="kt-widget14__legend">
					<span class="kt-widget14__bullet kt-bg-success"></span>
					<span class="kt-widget14__stats">37% Sport Tickets</span>
				</div>
				<div class="kt-widget14__legend">
					<span class="kt-widget14__bullet kt-bg-warning"></span>
					<span class="kt-widget14__stats">47% Business Events</span>
				</div>
				<div class="kt-widget14__legend">
					<span class="kt-widget14__bullet kt-bg-brand"></span>
					<span class="kt-widget14__stats">19% Others</span>
				</div>
			</div>			
		</div> 
	</div>
</div>		
<!--end:: Widgets/Profit Share-->			</div>
			<div class="col-xl-4">
				<!--begin:: Widgets/Revenue Change-->
<div class="kt-portlet kt-portlet--height-fluid">
	<div class="kt-widget14">
		<div class="kt-widget14__header">
			<h3 class="kt-widget14__title">
				Revenue Change            
			</h3>
			<span class="kt-widget14__desc">
				Revenue change breakdown by cities
			</span>
		</div>
		<div class="kt-widget14__content">
			<div class="kt-widget14__chart">
				<div id="kt_chart_revenue_change" style="height: 150px; width: 150px;"><svg height="150" version="1.1" width="150" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" style="overflow: hidden; position: relative; left: -0.65625px; top: -0.890625px;"><desc style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0);">Created with Rapha�l 2.2.0</desc><defs style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0);"></defs><path fill="none" stroke="#34bfa3" d="M75,118.33333333333334A43.333333333333336,43.333333333333336,0,0,0,117.85251574201737,68.56263467263734" stroke-width="2" opacity="0" style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0); opacity: 0;"></path><path fill="#34bfa3" stroke="#ffffff" d="M75,121.33333333333334A46.333333333333336,46.333333333333336,0,0,0,120.8192283703109,68.11697091920455L134.3342525658702,66.08672493134401A60,60,0,0,1,75,135Z" stroke-width="3" style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0);"></path><path fill="none" stroke="#fd3995" d="M117.85251574201737,68.56263467263734A43.333333333333336,43.333333333333336,0,0,0,82.89188458674082,32.39136313554092" stroke-width="2" opacity="1" style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0); opacity: 1;"></path><path fill="#fd3995" stroke="#ffffff" d="M120.8192283703109,68.11697091920455A46.333333333333336,46.333333333333336,0,0,0,83.43824582736133,29.441534429539914L86.83782688011121,11.087044703311392A65,65,0,0,1,139.27877361302606,65.34395200895602Z" stroke-width="3" style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0);"></path><path fill="none" stroke="#5d78ff" d="M82.89188458674082,32.39136313554092A43.333333333333336,43.333333333333336,0,1,0,74.98638643205842,118.33333119491907" stroke-width="2" opacity="0" style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0); opacity: 0;"></path><path fill="#5d78ff" stroke="#ffffff" d="M83.43824582736133,29.441534429539914A46.333333333333336,46.333333333333336,0,1,0,74.98544395427786,121.333331046875L74.98115044438859,134.9999970391187A60,60,0,1,1,85.92722481241034,16.003425879979744Z" stroke-width="3" style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0);"></path><text x="75" y="65" text-anchor="middle" font-family="&quot;Arial&quot;" font-size="15px" stroke="none" fill="#000000" style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0); text-anchor: middle; font-family: Arial; font-size: 15px; font-weight: 800;" font-weight="800" transform="matrix(0.9848,0,0,0.9848,1.1362,1.1515)" stroke-width="1.0153846153846153"><tspan dy="6" style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0);">London</tspan></text><text x="75" y="85" text-anchor="middle" font-family="&quot;Arial&quot;" font-size="14px" stroke="none" fill="#000000" style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0); text-anchor: middle; font-family: Arial; font-size: 14px;" transform="matrix(0.9028,0,0,0.9028,7.3008,7.4861)" stroke-width="1.1076923076923078"><tspan dy="5" style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0);">7</tspan></text></svg></div>
			</div>  		 
			<div class="kt-widget14__legends">
				<div class="kt-widget14__legend">
					<span class="kt-widget14__bullet kt-bg-success"></span>
					<span class="kt-widget14__stats">+10% New York</span>
				</div>
				<div class="kt-widget14__legend">
					<span class="kt-widget14__bullet kt-bg-warning"></span>
					<span class="kt-widget14__stats">-7% London</span>
				</div>
				<div class="kt-widget14__legend">
					<span class="kt-widget14__bullet kt-bg-brand"></span>
					<span class="kt-widget14__stats">+20% California</span>
				</div>
			</div>		 
		</div> 	 
	</div>
</div>	
<!--end:: Widgets/Revenue Change-->			</div>
		</div>
	</div>
</div>

<!-- Begin: table -->
	<div class="kt-portlet">
				<div class="kt-portlet__head">
					<div class="kt-portlet__head-label">
						<h3 class="kt-portlet__head-title">
							Striped Rows
						</h3>
					</div>
				</div>
				<div class="kt-portlet__body">
					<!--begin::Section-->
					<div class="kt-section">
						<div class="kt-section__content">
							<table class="table table-striped">
							  	<thead>
							    	<tr>
							      		<th>#</th>
							      		<th>First Name</th>
							      		<th>Last Name</th>
							      		<th>Username</th>
							    	</tr>
							  	</thead>
							  	<tbody>
							    	<tr>
								      	<th scope="row">1</th>
								      	<td>Jhon</td>
								      	<td>Stone</td>
								      	<td>@jhon</td>
							    	</tr>
							    	<tr>
							      		<th scope="row">2</th>
							      		<td>Lisa</td>
							      		<td>Nilson</td>
							      		<td>@lisa</td>
							    	</tr>
							    	<tr>
							      		<th scope="row">3</th>
							      		<td>Larry</td>
							      		<td>the Bird</td>
							      		<td>@twitter</td>
							    	</tr>
							  	</tbody>
							</table>
						</div>
					</div>
					<!--end::Section-->
				</div>
				<!--end::Form-->
			</div>
<!-- End: table -->

<!--begin::Portlet-->
     <div class="kt-portlet kt-portlet--tab">
            <div class="kt-portlet__head">
                <div class="kt-portlet__head-label">
                    <span class="kt-portlet__head-icon kt-hidden">
                        <i class="la la-gear"></i>
                    </span>
                    <h3 class="kt-portlet__head-title">
                        Pie Chart
                    </h3>
                </div>
            </div>
            <div class="kt-portlet__body">
                <div id="kt_morris_4" style="height:500px;"><svg height="500" version="1.1" width="1538" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" style="overflow: hidden; position: relative;"><desc style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0);">Created with Rapha�l 2.2.0</desc><defs style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0);"></defs><path fill="none" stroke="#593ae1" d="M769,410A160,160,0,0,0,919.752398153737,303.60703732624245" stroke-width="2" opacity="0" style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0); opacity: 0;"></path><path fill="#593ae1" stroke="#ffffff" d="M769,413A163,163,0,0,0,922.5790056191196,304.6121692761095L990.4175847883013,328.73533607291864A235,235,0,0,1,769,485Z" stroke-width="3" style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0);"></path><path fill="none" stroke="#6e4ff5" d="M919.752398153737,303.60703732624245A160,160,0,0,0,625.4374077979751,179.361610152587" stroke-width="2" opacity="0" style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0); opacity: 0;"></path><path fill="#6e4ff5" stroke="#ffffff" d="M922.5790056191196,304.6121692761095A163,163,0,0,0,622.7456091941872,178.03714034294802L558.142442703276,146.24986491161218A235,235,0,0,1,990.4175847883013,328.73533607291864Z" stroke-width="3" style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0);"></path><path fill="none" stroke="#9077fb" d="M625.4374077979751,179.361610152587A160,160,0,0,0,768.9497345183696,409.99999210431656" stroke-width="2" opacity="1" style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0); opacity: 1;"></path><path fill="#9077fb" stroke="#ffffff" d="M622.7456091941872,178.03714034294802A163,163,0,0,0,768.948792040589,412.9999919562725L768.9246017775544,489.99998815647484A240,240,0,0,1,553.6561116969626,144.0424152288805Z" stroke-width="3" style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0);"></path><text x="769" y="240" text-anchor="middle" font-family="&quot;Arial&quot;" font-size="15px" stroke="none" fill="#000000" style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0); text-anchor: middle; font-family: Arial; font-size: 15px; font-weight: 800;" font-weight="800" transform="matrix(2.1279,0,0,2.1279,-867.349,-283.1067)" stroke-width="0.4699435763888889"><tspan dy="6" style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0);">Mail-Order Sales</tspan></text><text x="769" y="260" text-anchor="middle" font-family="&quot;Arial&quot;" font-size="14px" stroke="none" fill="#000000" style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0); text-anchor: middle; font-family: Arial; font-size: 14px;" transform="matrix(3.3333,0,0,3.3333,-1794.5521,-588)" stroke-width="0.3"><tspan dy="5" style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0);">20</tspan></text></svg></div>
            </div>
        </div>
<!--end::Portlet-->

"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 29 14:37:34 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/defaultTeacherDashboard.scala.html
                  HASH: 28302b6d4e14bab4136f7e8eb2e002885409c7d6
                  MATRIX: 1048->0
                  LINES: 33->1
                  -- GENERATED --
              */
          