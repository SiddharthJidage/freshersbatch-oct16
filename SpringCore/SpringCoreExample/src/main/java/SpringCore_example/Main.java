package SpringCore_example;

// import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("unused")
public class Main {
	
	private static AbstractApplicationContext context;
	
	public static void main(String[] args) {
		 context = new ClassPathXmlApplicationContext("beans.xml");
		 context.registerShutdownHook();
		
		Spring1 helloBean = (Spring1) context.getBean("Spring1");
		helloBean.sayHello();
		
		Triangle triangle =  (Triangle) context.getBean("triangle");
		triangle.Draw();
		
	}

}
