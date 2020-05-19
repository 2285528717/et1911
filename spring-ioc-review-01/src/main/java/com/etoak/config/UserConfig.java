package com.etoak.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.etoak.action.UserAction;
import com.etoak.service.UserService;

@Configuration
public class UserConfig {
	
	//使用@Bean注册spring bean
		@Bean("userService")
		public UserService userService() {
			return new UserService();
		}
		
		@Bean
	public UserAction userAction(@Qualifier("userService") UserService userService) {
			
			UserAction userAction = new UserAction();
			//userAction.setUserService(this.userService());
			
			//配合@Qualifier使用
			userAction.setUserService(userService);
			return userAction;
		}
}
