package com.ioc.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class LooseCouplingExample {
    public static void main(String[] args) {
    	//here u are creating object of each provider
    	//and assigning it value
//        UserDataProvider databaseProvider = new UserDatabaseProvider();
//        UserManager userManagerWithDB = new UserManager(databaseProvider);
//        System.out.println(userManagerWithDB.getUserInfo());
//
//        UserDataProvider webServiceProvider = new WebServiceDataProvider();
//        UserManager userManagerWithWS = new UserManager(webServiceProvider);
//        System.out.println(userManagerWithWS.getUserInfo());
//
//        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
//        UserManager userManagerWithNewDB = new UserManager(newDatabaseProvider);
//        System.out.println(userManagerWithNewDB.getUserInfo());
    	
    	
    	//So now instead of new WebServiceDataProvider()/ new UserDatabaseProvider(),etc
    	//Spring injects it in your main file automaticlly
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationIOCConstructorInjection.xml");
    	UserManager usm=(UserManager)context.getBean("firstbean"); 	
    	UserManager usm2=(UserManager)context.getBean("secondbean");
    	
    	System.out.println(usm.getUserInfo());
    	System.out.println(usm2.getUserInfo());
    
    }
}
