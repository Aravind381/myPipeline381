package Controller;

import Service.Employee_service;

public class Employee_controller {
 
	public static void main(String[] args) {
		Employee_service cs=new Employee_service();
		
	         String res=cs.createEmployeTable();
	         if(res !=null) {
		System.out.println(res);
	         }

	}
}

