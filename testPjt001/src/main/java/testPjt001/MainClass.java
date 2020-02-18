package testPjt001;

import java.io.ObjectInputStream.GetField;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext cxt = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TransportationWalk transportationWalk = cxt.getBean("tWalk", TransportationWalk.class);
		transportationWalk.move();
		
		cxt.close();
	}
}
