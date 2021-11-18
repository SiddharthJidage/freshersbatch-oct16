package SpringCore_example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	private static BeanFactory bF;

	public static void main(String[] args) {
		//Triangle Tr= new Triangle();
		
		 bF = new ClassPathXmlApplicationContext("beans.xml");
		Triangle triangle =  (Triangle) bF.getBean("triangle");
		
		//Tr.Draw();
		triangle.Draw();
		

	}

}
