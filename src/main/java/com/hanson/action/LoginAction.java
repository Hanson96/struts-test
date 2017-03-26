package com.hanson.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements ServletRequestAware{
	
	private HttpServletRequest request;
	private String userName;
	private String password;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		ActionContext ctx = ActionContext.getContext();System.out.println("username:"+userName);
		System.out.println("password:"+request.getParameter("password"));
		Map request_a = (Map)ctx.get("request");
		request_a.put("name", "hhh");
		if("hanson".equals(userName)){
			return this.SUCCESS;
		}else{
			return this.ERROR;
		}
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	
}
