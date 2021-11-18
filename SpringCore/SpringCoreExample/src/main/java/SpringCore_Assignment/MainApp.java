package SpringCore_Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext(
				new String[] {"Annotation.xml" });

		ProductService productService = (ProductService) context
				.getBean("productService");
		System.out.println(productService.getProductDetail("P1").getName());
		System.out.println(productService.getProductDetail("P2").getName());
		System.out.println(productService.getProductDetail("P3").getName());

	}
}