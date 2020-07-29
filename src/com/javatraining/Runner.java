package com.javatraining;


public class Runner
{
	public static void main(String[]args) {
		Employee emp= new Manager("Sales","Akhil",21,"976037****");
		if(emp instanceof Manager) {
			Manager man=(Manager)emp;
			man.testMan();
		}
		emp.testEmp();
		
	}
}

