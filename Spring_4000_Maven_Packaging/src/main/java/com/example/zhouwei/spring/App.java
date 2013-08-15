package com.example.zhouwei.spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.zhouwei.spring.model.User;
import com.example.zhouwei.spring.service.UserService;

/**
 * Hello world!
 * 
 */
public class App {
	
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"/beans.xml");
		UserService service = (UserService) ctx.getBean("userService");
		System.out.println(service.getClass());
		User user = new User();
		service.add(user);
	}
	
	public static <T> T getController(String fxmlFileName) throws IOException {
		BufferedReader br = new BufferedReader(
			new InputStreamReader(App.class.getResourceAsStream("/fxml/" + fxmlFileName), "utf-8"));
		String string = null;
		while ((string = br.readLine()) != null) {
			System.out.println(string);
		}
		br.close();
		return null;
	}
}
