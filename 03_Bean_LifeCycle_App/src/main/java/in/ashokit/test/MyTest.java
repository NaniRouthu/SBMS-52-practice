package in.ashokit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.Motor;

public class MyTest {

	public static void main(String[] args) {
		
	ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");
	
	Motor motor = ctxt.getBean(Motor.class);
	
	motor.dowork();
	 ConfigurableApplicationContext cactxt=
             (ConfigurableApplicationContext)ctxt;
     
     cactxt.close();

	

	}

}
