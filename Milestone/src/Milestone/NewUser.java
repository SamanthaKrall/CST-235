package Milestone;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@SessionScoped
public class NewUser {
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneN() {
		return phoneN;
	}

	public void setPhoneN(String phoneN) {
		this.phoneN = phoneN;
	}

	@NotNull(message="Please enter a User ID. This is a required field.")
	@Size(min=4, max=15)
	private String userID;
	
	@NotNull(message="Please enter a Password. This is a required field.")
	@Size(min=4, max=15)
	private String password;
	
	@NotNull(message="Please enter your first name. This is a required field.")
	@Size(min=4, max=15)
	private String firstName;
	
	@NotNull(message="Please enter your last name. This is a required field.")
	@Size(min=4, max=15)
	private String lastName;
	
	@NotNull(message="Please enter your email. This is a required field.")
	@Size(min=5, max=40)
	private String email;
	
	@NotNull(message="Please enter your phone number with the area code. This is a required field.")
	@Size(min=10, max=11)
	private String phoneN;
	
	public NewUser(){
		userID = "";
		password = "";
		firstName = "";
		lastName = "";
		email = "";
		phoneN = "";
	}

}
