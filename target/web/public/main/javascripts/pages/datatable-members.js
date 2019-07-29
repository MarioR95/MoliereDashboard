var EMAIL_INDEX= 0;
var USERID_INDEX= 1;
var NAME_INDEX= 2;
var SURNAME_INDEX= 3;
var LASTEVENT_INDEX= 4;


//Class definition
var Datatable = function(){
	
	var fill_datatable= function(n_members, emails, ids, names, surnames, lastEvents){
		for(var i=0; i<n_members; i++){
			$("#tbody-members").append(
			"<tr>"+
		    "  	<th scope='row'>"+(i+1)+"</th>"+
		    "  	<td>"+names[i]+"</td>"+
		    "  	<td>"+surnames[i]+"</td>"+
		    "  	<td>"+ids[i]+"</td>"+
		    "  	<td>"+lastEvents[i]+"</td>"+
		    "  	<td>"+
			"      	<div class='dropdown dropright'>"+
            "            <button type='button' class='btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false'>"+
            "                <i class='flaticon-more-1'></i>"+
            "            </button>"+
            "            <div class='dropdown-menu dropdown-menu-left' x-placement='top-start' style='position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);'>"+
            "                <a class='dropdown-item' href='#'><i class='flaticon-profile-1'></i> Details</a>"+
            "                <a class='dropdown-item' href='/studentStats?courseId=HarvardX/CB22x/2013_Spring&name="+names[i]+"&surname="+surnames[i]+"&userId="+ids[i]+"' ><i class='flaticon-analytics'></i> Stats</a>"+
            "                <div class='dropdown-divider'></div>"+
            "                <a class='dropdown-item kt-font-danger' href='#'><i class='flaticon-delete kt-font-danger'></i> Delete</a>"+
            "            </div>"+
            "    	</div>"+
            "	</td>"+
	    	"</tr>");
		}
			
	}
	
	
	return {
		// public functions
		init: function(data) {
			var n_members= data.length;
			var emails= [];
			var names = [];
			var surnames = [];
			var ids= [];
			var lastEvents= [];
			for(var i=0; i<n_members; i++){
				emails[i]= data[i][EMAIL_INDEX];
				ids[i]= data[i][USERID_INDEX];
				names[i]= data[i][NAME_INDEX];
				surnames[i]= data[i][SURNAME_INDEX];
				lastEvents[i]= data[i][LASTEVENT_INDEX];
			}
			
			fill_datatable(n_members, emails, ids, names, surnames, lastEvents);
		}
	};
	
}();


jQuery(document).ready(function() {
	//Get URL
	$.urlParam = function(name){
		var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(window.location.href);
		return results[1] || 0;
	}
		
	$.ajax({
		type: "GET",
		url : "/courseMembers",
		data : "courseId="+$.urlParam('courseId'),
        contentType: "application/json; charset=utf-8",
		dataType: "json",
		success: function(data){
			//Datatable
			Datatable.init(data);
		},
		error: function(err){
			console.log(err)
		}
	});
	
	
});