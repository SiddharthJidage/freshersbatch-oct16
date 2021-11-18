package SpringCore4_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext factory= new AnnotationConfigApplicationContext(Info.class);
        
        
        MarvelStudios MCU= factory.getBean(MarvelStudios.class);
        MCU.Info();
    }
}
