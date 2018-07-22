package Controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import Milestone.NewUser;

@ManagedBean
public class RegisterFormController {
	public String register(){
		//get the new user values from the register form
		FacesContext context = FacesContext.getCurrentInstance();
		NewUser newUser = context.getApplication().evaluateExpressionGet(context, "#{NewUser}", NewUser.class);
		
		//put new user object into POST request
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("NewUser", newUser);
		
		//show the next page
		return "NewUserResponse.xhtml";
	}
	

}
