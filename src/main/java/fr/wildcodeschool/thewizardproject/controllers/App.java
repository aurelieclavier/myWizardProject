package fr.wildcodeschool.thewizardproject.controllers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.wildcodeschool.thewizardproject.models.WizardInterface;


public class App {

	public void start() {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:wizardContext.xml");

    	WizardInterface myWizzard = context.getBean("wizardId", WizardInterface.class);
    	
        context.close();

        System.out.println("");
        System.out.println("******************");
        System.out.println(myWizzard.changeDress());
        System.out.println("******************");
        System.out.println(myWizzard.giveAdvice());

	}
	
}
