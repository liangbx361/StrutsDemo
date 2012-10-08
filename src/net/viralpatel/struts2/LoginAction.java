package net.viralpatel.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport  {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7025202904193630399L;
	
	private String username;
	private String password;

	public String execute() {

		if (this.username.equals("admin") && this.password.equals("admin")) {
			return ActionSupport.SUCCESS;
		} else {
			addActionError(getText("error.login"));
			return ActionSupport.ERROR;
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
