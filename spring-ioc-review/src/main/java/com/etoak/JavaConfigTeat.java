package com.etoak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.etoak.action.UserAction;
import com.etoak.bean.User;
import com.etoak.config.UserConfig;

public class JavaConfigTeat {

	public static void main(String[] args) {
		
		ApplicationContext ioc = new AnnotationConfigApplicationContext(UserConfig.class);
		UserAction userAction = ioc.getBean(UserAction.class);
		User user = userAction.getById(1000);
		System.out.println(user.getId()+"-"+user.getName());
	}

}
