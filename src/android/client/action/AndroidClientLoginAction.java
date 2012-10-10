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
	
	//���ᱻStruts2���л�ΪJSON�ַ����Ķ���  
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
	 * ��֤�ʻ�
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
		 
//        // dataMap�е����ݽ��ᱻStruts2ת����JSON�ַ�������������Ҫ��������е�����   
//        dataMap = new HashMap<String, Object>();   
//        User user = new User();   
//        user.setName("����");   
//        user.setPassword("123");   
//        dataMap.put("user", user);   
//        // ����һ���Ƿ�����ɹ��ı�ʶ   
//        dataMap.put("success", true);   
        
        // ���ؽ��   
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
