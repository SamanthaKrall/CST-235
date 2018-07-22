package Controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import Milestone.User;

@ManagedBean
public class LoginFormController {
	public String onLogin(){
		//get the user values from the loginForm
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		
		
		System.out.println("You clicked the login button " + user.getUserID());
		
		//put the user object into the POST request
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		
		//show the next page
		return "loginResponse.xhtml";
	}
	public String register(){
		
		System.out.println("You clicked the register button.");
		return "RegisterResponse.xhtml";
	}
}

