// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Arufonso/Desktop/MoliereDashboard/conf/routes
// @DATE:Wed Nov 27 11:23:37 CET 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def buildDashboard(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dashboard")
    }
  
    // @LINE:5
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:55
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:19
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def retrieveStudentsStatus(courseId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "retrieveStudentsStatus" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)))))
    }
  
    // @LINE:25
    def studentStats(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "studentStats")
    }
  
    // @LINE:37
    def fetchStudentMeasurements(courseId:String, userId:String, weekNumber:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchStudentMeasurements" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("weekNumber", weekNumber)))))
    }
  
    // @LINE:39
    def executeMap(courseId:String, userId:String, weekNumber:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "executeMap" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("weekNumber", weekNumber)))))
    }
  
    // @LINE:45
    def retrieveFeedbackImprovements(actionId:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "feedbackPrediction" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("actionId", actionId)))))
    }
  
    // @LINE:43
    def feedbackChoice(courseId:String, userId:String, weekNumber:Integer, mot:Double, eng:Double): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "feedbackChoice" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("weekNumber", weekNumber)), Some(implicitly[play.api.mvc.QueryStringBindable[Double]].unbind("mot", mot)), Some(implicitly[play.api.mvc.QueryStringBindable[Double]].unbind("eng", eng)))))
    }
  
    // @LINE:49
    def checkEfficacy(courseId:String, userId:String, prevDate:String, prevWeek:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "checkEfficacy" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("prevDate", prevDate)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("prevWeek", prevWeek)))))
    }
  
    // @LINE:31
    def courseMembers(courseId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "courseMembers" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)))))
    }
  
    // @LINE:35
    def fetchStudentRecords(courseId:String, userId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchStudentRecords" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)))))
    }
  
    // @LINE:19
    def authenticate(email:String, password:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "authenticate" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("email", email)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("password", password)))))
    }
  
    // @LINE:41
    def fetchFeedback(userId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchFeedback" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)))))
    }
  
    // @LINE:27
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:22
    def courseDetails(courseId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "course" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)))))
    }
  
    // @LINE:51
    def sendFeedback(courseId:String, userId:String, actionId:Integer, actionType:String, name:String, description:String, date:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sendFeedback" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("actionId", actionId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("actionType", actionType)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("description", description)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("date", date)))))
    }
  
    // @LINE:33
    def fetchStudentStats(courseId:String, userId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchStudentStats" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)))))
    }
  
  }


}
