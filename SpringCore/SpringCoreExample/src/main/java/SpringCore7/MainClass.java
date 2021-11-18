package SpringCore7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		
		ApplicationContext contests = new AnnotationConfigApplicationContext(ConfigClass.class);
		
		PaymentClass obj = (PaymentClass) contests.getBean("paymentprocess");
		obj.Display();
	}

}
