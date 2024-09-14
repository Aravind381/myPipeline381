package Service;

import java.util.List;

import Employee_Dao.Employeedao;
import Employee_Dto.Employee;

public class Employee_service {
	Employeedao st=new Employeedao();
    public String createEmployeTable() {
    	return st.createEmployeTable();
    }
    public int saveEmploye(Employee employe) {
   	 return st.saveEmploye(employe);
    }   
    public int updateemploye(Employee employe) {
     	  return st.updateEmploye(employe);
      }
    public List<Employee> getEmployeInfoByAll() {
     	  return st.getEmployeInfoByAll();
     			  
       }
}
