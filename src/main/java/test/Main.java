package test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		//ApplicationContext ctx = new ClassPathXmlApplicationContext("cryptage.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("decryptage.xml");

	}

}
 