package com.hanson.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	
	private String userName;
	
	private String password;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		ActionContext ctx = ActionContext.getContext();
		Map request_a = (Map)ctx.get("request");
		request_a.put("name", "hhh");
		if("hanson".equals(userName)){
			return this.SUCCESS;
		}else{
			return this.ERROR;
		}
	}
}
