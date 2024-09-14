package Controller;

import Employee_Dto.Employee;
import Service.Employee_service;

public class Update_Employe_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employe=new Employee();
		employe.setId(9);
		employe.setName("sai");
		employe.setPosition("developer");
		employe.setSalary(1000.00);
		
		Employee_service service=new Employee_service();
		int res=service.updateemploye(employe);
		if(res>0) {
			System.out.println("your data has updated");
		}else {
			System.out.println("plz check the code");
		}
		

	}
}
