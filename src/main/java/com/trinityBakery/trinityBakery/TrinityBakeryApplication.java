package com.trinityBakery.trinityBakery;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class TrinityBakeryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrinityBakeryApplication.class, args);
	}
	
	@RequestMapping(value = "/")
    public String login(String account,String password,
    		            Map<String,Object> map) {
		if(!StringUtils.isEmpty(account) ) {
			//登陆成功
			if( "user".equals(password)) {
				return "shopping";
			}
			else if("sale".equals(password)) {
				return "sale";
			}
			else if("account".equals(password)) {
				return "finance-account";
			}
			else if("cashier".equals(password)) {
				return "finance-cashier";
			}
			else if("pps".equals(password)) {
				return "ProductionPlanningSection";
			}
			else if("fpl".equals(password)) {
				return "finishedProducLibrary";
			}
			else if("boss".equals(password)) {
				return "boss";
			}
			else if("admin".equals(password)) {
				return "Admin";
			}
			else if("production".equals(password)) {
				return "productionWork";
			}
			else return "login";
		}
		else {
			//登陆失败
			map.put("msg", "用户名密码错误");
			return "login";
		}
     }
}
	
