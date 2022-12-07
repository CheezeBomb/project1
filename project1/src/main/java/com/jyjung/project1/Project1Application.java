package com.jyjung.project1;

import java.util.Iterator;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@SpringBootApplication
public class Project1Application {
	public static void main(String[] args) {
		// SpringApplication.run(Project1Application.class, args);
		 SpringApplication app =  new SpringApplication(Project1Application.class);
		 app.addListeners(new ApplicationPidFileWriter());
	     app.run(args);
	}
	
    public void run(ApplicationArguments args) throws Exception {
        
        Iterator<String> iter = args.getOptionNames().iterator();
        while( iter.hasNext() ) {
            String key = iter.next();
            Object value = args.getOptionValues(key);

        }
    }
	

}
