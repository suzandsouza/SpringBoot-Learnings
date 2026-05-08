package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//this class will have the main m/d
public class App {
	public static void main(String[]args) {
		//here we import the interface implementations of springboot
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationBeanContext.xml");
		
		//here spring is giving u the object
		MyBean myBean=(MyBean)context.getBean("myBean");
		
		System.out.println(myBean);
	}
}
