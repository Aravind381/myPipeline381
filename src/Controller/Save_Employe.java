package Controller;

import Employee_Dto.Employee;
import Service.Employee_service;

public class Save_Employe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee employe=new Employee();
       
       employe.setId(10);
       employe.setName("siva");
       employe.setPosition("developer");
       employe.setSalary(1000.00);
       
       Employee_service service=new Employee_service();
        int res=service.saveEmploye(employe);
        
        if(res>0) {
        	System.out.println("data saved");
        }else {
        	System.out.println("plz check the code");
        }
       
       
	}

}

