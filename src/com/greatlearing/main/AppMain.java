package com.greatlearing.main;

import java.util.Scanner;

import com.greatlearing.interfaces.ICredentials;
import com.greatlearing.model.Employee;
import com.greatlearing.service.CredentialsService;

public class AppMain {
	public static void main(String[] args) {
					
		Employee demoEmployee = new Employee("John", "Adam");
		ICredentials credentialsService = new CredentialsService();
		
		System.out.println("Please choose the department from the following");
		System.out.println("1. Thechnical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner userInput = new Scanner(System.in);
		int option = userInput.nextInt();
			
		String generatedEmail = null;
		String generatedPassword = null;
			
		switch(option) {
			
			case 1: {
				generatedEmail = credentialsService.generateEmailAddress(demoEmployee.getFirstName().toLowerCase(),demoEmployee.getLastName().toLowerCase(),"tech");
				generatedPassword = credentialsService.generatePassword();
				break;
			}
			case 2: {
				generatedEmail = credentialsService.generateEmailAddress(demoEmployee.getFirstName().toLowerCase(),demoEmployee.getLastName().toLowerCase(),"adm");
				generatedPassword = credentialsService.generatePassword();
				break;
			}
			case 3: {
				generatedEmail = credentialsService.generateEmailAddress(demoEmployee.getFirstName().toLowerCase(),demoEmployee.getLastName().toLowerCase(),"hr");
				generatedPassword = credentialsService.generatePassword();
				break;
			}
			case 4: {
				generatedEmail = credentialsService.generateEmailAddress(demoEmployee.getFirstName().toLowerCase(),demoEmployee.getLastName().toLowerCase(),"lg");
				generatedPassword = credentialsService.generatePassword();
				break;
			}
			default : {
				System.out.println("Enter a valid department optiom");
			}
			
			demoEmployee.setEmail(generatedEmail);
			demoEmployee.setPassword(generatedPassword);
			credentialsService.showCredentials(demoEmployee);
			userInput.close();	
				
			}
		}
	
	
		
}		
