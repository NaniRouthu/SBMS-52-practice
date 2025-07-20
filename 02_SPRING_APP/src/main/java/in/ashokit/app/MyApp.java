package in.ashokit.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.UserService;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");
		UserService bean = ctxt.getBean(UserService.class);
		bean.saveUser("nani", "nani@1234", 1234567895L);

	}

}
