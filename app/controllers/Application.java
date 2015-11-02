package controllers;

import play.*;
import play.mvc.*;

public class Application extends Controller {

    public static Result index() {
        return ok("Your new application is ready.");
    }
    public static Result list(){
    	return TODO;
    }
    public static Result newProduct(){
    	return TODO;
    }
    public static Result details(String ean){
    	return TODO;
    }
    public static Result save(){
    	return TODO;
    }

}
