package Milestone;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@SessionScoped
public class User {
	@NotNull(message="Please enter a User ID. This is a required field.")
	@Size(min=4,max=15)
	private String userID;
	
	@NotNull(message="Please enter a Password. This is a required field.")
	@Size(min=4, max=15)
	private String password;
	
	
	
	public User(){
		userID = "";
		password = "";
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
}
