package SpringCore8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
   public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

      LifecycleCallback obj = (LifecycleCallback) context.getBean("Str");
      obj.getMessage();
      context.registerShutdownHook();
   }
}
