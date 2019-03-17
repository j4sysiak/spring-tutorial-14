package pl.jaceksysiak.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("pl/jaceksysiak/spring/test/beans/beans.xml");


		FruitBasket basket  = (FruitBasket)context.getBean("basket");
		
		System.out.println(basket);
	 
		 ((ClassPathXmlApplicationContext)context).close();

	}
 
 

}




























