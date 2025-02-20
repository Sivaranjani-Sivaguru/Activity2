package activity2.activity298;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Appconfig;
import com.model.CityBasedService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext (com.config.Appconfig.class);
    	
    	CityBasedService cty=context.getBean(CityBasedService.class);
    	System.out.println("City based services");
    	System.out.println(cty);
    	context.close();
    	
    	
    	
    }
}
