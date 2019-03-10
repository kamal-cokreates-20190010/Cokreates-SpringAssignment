package ckl.kamal.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoBeanScopeApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope_applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCricketCoach", Coach.class);

		Coach alphaCoach = context.getBean("myCricketCoach", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		// print out the results
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);

		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
	
		// close the context
		context.close();
	}

}








