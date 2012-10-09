package android.client.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import json.data.User;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.components.ActionComponent;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.sun.corba.se.spi.orbutil.fsm.ActionBase;

public class AndroidClientLoginAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4023683961974146423L;
	
	private String username;
	private String password;
	
	//将会被Struts2序列化为JSON字符串的对象  
	private Map<String, Object> dataMap;
	
	public AndroidClientLoginAction() {
		dataMap = new HashMap<String, Object>();
	}

	@Override
	public String execute() throws Exception {
		
		System.out.println("android client ----------> execute");
		
		if (this.username.equals("admin") && this.password.equals("admin")) {
			return ActionSupport.SUCCESS;
		} else {
			addActionError(getText("error.login"));
			return ActionSupport.ERROR;
		}
	}
	
	/**
	 * 验证帐户
	 * @return
	 */
//	public String verifyAccount() {
	public String test() {
		
		System.out.println("android client ----------> verifyAccount");
		
		User user = new User();  
        user.setId("123");  
        user.setName("JSONActionJSP");  
        user.setPassword("123");  
        user.setSay("Hello world !");  
        JSONObject jsonObject=new JSONObject();  
        jsonObject.accumulate("user", user);  
        jsonObject.accumulate("success", true);  
        //这里在request对象中放了一个data，所以struts的result配置中不能有type="redirect"  
        ServletActionContext.getRequest().setAttribute("data", jsonObject.toString());  
        return SUCCESS; 
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
	
	public Map<String, Object> getDataMap() {  
        return dataMap;  
    } 

}
