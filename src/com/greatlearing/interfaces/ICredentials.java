package com.greatlearing.interfaces;

import com.greatlearing.model.Employee;

public interface ICredentials {
	
	public String generateEmailAddress(String fistName, String lastName, String department);
	
	
	public String generatePassword();
	
	public void showCredentials(Employee employee);
	
}

