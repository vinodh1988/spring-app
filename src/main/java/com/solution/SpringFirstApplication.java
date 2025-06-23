package com.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.solution.process.Activity;

@SpringBootApplication
public class SpringFirstApplication {

	public static void main(String[] args) {
	 ApplicationContext ac = SpringApplication.run(SpringFirstApplication.class, args);
	 System.out.println("Application started successfully!");
	 System.out.println("Bean count: " + ac.getBeanDefinitionCount());
	 Activity coding = (Activity)ac.getBean("coding");
	 Activity coding2 = (Activity)ac.getBean("coding");
	 Activity coding3 = (Activity)ac.getBean("coding");
	 Activity documenting = (Activity)ac.getBean("doc");
	 Activity documenting2 = (Activity)ac.getBean("doc");
	 Activity documenting3 = (Activity)ac.getBean("doc");
	 
	 coding.task();
	 coding2.task();
	 coding3.task();
	 System.out.println("===================================");
	 System.out.println("Coding 1 hashCode: " + Integer.toHexString(coding.hashCode()));
     System.out.println("Coding 2 hashCode: " + Integer.toHexString(coding2.hashCode()));
     System.out.println("Coding 3 hashCode: " + Integer.toHexString(coding3.hashCode()));
     
	 documenting.task();
	 documenting2.task();
	 documenting3.task();
    System.out.println("===================================");
    System.out.println("Documenting 1 hashCode: " + Integer.toHexString(documenting.hashCode()));
    System.out.println("Documenting 2 hashCode: " + Integer.toHexString(documenting2.hashCode()));
    System.out.println("Documenting 3 hashCode: " + Integer.toHexString(documenting3.hashCode()));
	}

}
