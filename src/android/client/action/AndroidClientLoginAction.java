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
	
//	@Override
//	public String execute() throws Exception {
//		
//		System.out.println("android client ----------> execute");
//		
//		if (this.username.equals("admin") && this.password.equals("admin")) {
//			return ActionSupport.SUCCESS;
//		} else {
//			addActionError(getText("error.login"));
//			return ActionSupport.ERROR;
//		}
//	}
	
	/**
	 * 验证帐户
	 * @return
	 */
	public String verifyAccount() {
		
		System.out.println("android client ----------> verifyAccount");
		
		dataMap = new HashMap<String, Object>(); 
		if(username!= null && username.equals("admin") && password!=null && password.equals("admin")) {
			dataMap.put("success", true);
		} else {
			dataMap.put("success", false);
		}
		 
//        // dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据   
//        dataMap = new HashMap<String, Object>();   
//        User user = new User();   
//        user.setName("张三");   
//        user.setPassword("123");   
//        dataMap.put("user", user);   
//        // 放入一个是否操作成功的标识   
//        dataMap.put("success", true);   
        
        // 返回结果   
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
