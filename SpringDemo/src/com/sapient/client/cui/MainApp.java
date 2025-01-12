package com.sapient.client.cui;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sapient.beans.security.Authentication;
import com.sapient.beans.security.BasicAuthentication;
import com.sapient.beans.security.GUIAuthentication;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log = Logger.getLogger(MainApp.class.getName());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		log.info("Spring IoC instantiated");
		Authentication authentication = (Authentication) context.getBean("authBean");
		log.info("Authenticator obtained");
		boolean status = authentication.validateCredentials("Jiaju", "Xu");
		log.info(status);
		if (authentication instanceof BasicAuthentication) {
			log.info(((BasicAuthentication)authentication).getMaxAttempts());
		}
		
		
		GUIAuthentication guiAuthentication = (GUIAuthentication) context.getBean("guiAuthBean");
		log.info("Gui authenticator obtained");
		log.info(guiAuthentication.getMaxAttempts());
		
	}
}
