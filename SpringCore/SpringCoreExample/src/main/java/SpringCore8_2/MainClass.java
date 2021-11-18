package SpringCore8_2;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
   public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

      PostPreAnno obj = (PostPreAnno) context.getBean("Str2");
      obj.getMessage();
      context.registerShutdownHook();
   }
}