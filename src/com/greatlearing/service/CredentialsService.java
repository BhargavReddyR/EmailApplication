package com.greatlearing.service;

import com.greatlearing.model.Employee;

import java.util.Random;

import com.greatlearing.interfaces.ICredentials;

public class CredentialsService implements ICredentials{

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {
		String atSymbol = "@";
		String atEnd= ".gl.com";
		String emailAddress = firstName+lastName+atSymbol+department+atEnd;
		return emailAddress;
	}

	@Override
	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String specialCharacters = "!@#$%^&*)_+><?(/.,";
		
		
		String allValues = capitalLetters +smallLetters + numbers + specialCharacters;
		
		Random randomObj = new Random ();
		String password="";
		
		for (int i=0; i<8; i++) {
			int boundValue = allValues.length();
			int randomIndex = randomObj.nextInt(boundValue);
			char randomChar =allValues.charAt(randomIndex);
			password +=String.valueOf(randomChar);
		}
				
		return password;
	}
	
	@Override
	public void showCredentials(Employee employee) {
		System.out.println("Dear "+employee.getFirstName() + " your generted credentials are :");
		System.out.println("Email ID : " + employee.getEmail());
		System.out.println("Password : " +employee.getPassword());
	}
}
