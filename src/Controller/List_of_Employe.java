package Controller;

import java.util.List;

import Employee_Dto.Employee;
import Service.Employee_service;

public class List_of_Employe {

	public static void main(String[] args) {
		Employee_service cs=new Employee_service();
		List<Employee> li=cs.getEmployeInfoByAll();
		if(li.size()>0) {
			for(Employee employe:li) {
				System.out.println("employe id:"+employe.getId());
				System.out.println("employe name:"+employe.getName());
				System.out.println("employe position:"+employe.getPosition());
				System.out.println("employe salary:"+employe.getSalary());
				
				System.out.println("##########****$$$$$$$");
			}
		}

	}
}
