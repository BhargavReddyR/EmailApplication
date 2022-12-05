package com.greatlearing.main;

import java.util.Scanner;

import com.greatlearing.interfaces.ICredentials;
import com.greatlearing.model.Employee;
import com.greatlearing.service.CredentialsService;

public class AppMain {
	public static void main(String[] args) {
		
		
		Employee demoEmployee = new Employee("Bhargav", "Ajay");
		ICredentials credentialsService = new CredentialsService();
		
		System.out.println("Please choose the department from the following options");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		
		Scanner userInput = new Scanner(System.in);
		int option = userInput.nextInt();
		
		String generatedEmail = null;
		String generatedPassword = null;
		
		switch(option) {
			case 1: {
				//dept is technical, short form is tech
				generatedEmail = credentialsService.generateEmailAddress(demoEmployee.getFirstName().toLowerCase(),
											demoEmployee.getLastName().toLowerCase(), "tech");
				generatedPassword = credentialsService.generatePassword();
				break;
			}
			case 2: {
				//dept is Admin, short form is adm
				generatedEmail = credentialsService.generateEmailAddress(demoEmployee.getFirstName().toLowerCase(),
											demoEmployee.getLastName().toLowerCase(), "adm");
				generatedPassword = credentialsService.generatePassword();
				break;
			}
			case 3: {
				//dept is HR, short form is hr
				generatedEmail = credentialsService.generateEmailAddress(demoEmployee.getFirstName().toLowerCase(),
											demoEmployee.getLastName().toLowerCase(), "hr");
				generatedPassword = credentialsService.generatePassword();
				break;
			}
			case 4: {
				//dept is Legal, short form is lg
				generatedEmail = credentialsService.generateEmailAddress(demoEmployee.getFirstName().toLowerCase(),
											demoEmployee.getLastName().toLowerCase(), "lg");
				generatedPassword = credentialsService.generatePassword();
				break;
			}
			default : {
				System.out.println("Enter a valid department option");
			}
		}
		
		demoEmployee.setEmail(generatedEmail);
		demoEmployee.setPassword(generatedPassword);
		credentialsService.showCredentials(demoEmployee);
		
		userInput.close();
	}
}
