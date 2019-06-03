package controllers;

import models.dao.UserDao;
import models.dto.UserDto;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

public class Application extends Controller {
	 
	public Result authenticate(Http.Request request, String email, String password) {

		try {
			UserDto user= new UserDao().doLogin(email, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return ok().addingToSession(request, "connected", email);
	}
	
	
	
	public Result logout(Http.Request request) {
		return ok(views.html.index.render()).removingFromSession(request,"connected");
	}
}
