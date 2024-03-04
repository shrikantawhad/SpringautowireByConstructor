package com.ncs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncs.beans.Address;
import com.ncs.beans.Student;
import com.ncs.beans.TextEditor;

public class Main {

	public static void main(String[] args) {
		
		String config_loc = "/com/ncs/resources/applicationContxt.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		 
		TextEditor te = (TextEditor) context.getBean("textEditor");
	    te.spellCheck();
		
	    Student std4 = (Student) context.getBean("stdAutowireByConstructor");

		
		//Autowired byConstructor
		System.out.println("Autowired byConstuctor:");
		std4.display();
	}
}
