package net.viralpatel.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport  {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7025202904193630399L;
	
	// 和username变量名无关
	private String username1;
	private String password;

	public String execute() {
		
		System.out.println("lbx ----------> execute");
		
		if (this.username1.equals("admin") && this.password.equals("admin")) {
			return ActionSupport.SUCCESS;
		} else {
			addActionError(getText("error.login"));
			return ActionSupport.ERROR;
		}
	}

	public String getUsername1() {
		return username1;
	}

	public void setUsername1(String username) {
		this.username1 = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
