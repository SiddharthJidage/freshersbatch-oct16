package SpringCore4_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("springCoreTest");
		context.refresh();

	 math M = context.getBean(math.class);

		int add = M.add(6, 44);
		System.out.println("Addition = " + add);

		int subtract = M.subtract(3, 26);
		System.out.println("Subtraction = " + subtract);
		
		context.close();
	}
	}
