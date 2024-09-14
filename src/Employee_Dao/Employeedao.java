package Employee_Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Employee_Dto.Employee;

public class Employeedao {
	 private boolean res;
	public String createEmployeTable(){
	    	
	    	try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","Mysql@123");
		    	java.sql.Statement s = c.createStatement();
		    	        setRes(s.execute("create table no1(id int primary key,name varchar(20),position varchar(45),salary double)"));
		   	c.close();
		   	return "table created";
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;

	    	
	    	
	    	
	    }
	 public int saveEmploye(Employee employe) {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","Mysql@123");
				
		         PreparedStatement ps=c.prepareStatement("insert into no1 values(?,?,?,?)");
		         ps.setInt(1, employe.getId());
		         ps.setString(2, employe.getName());
		         ps.setString(3, employe.getPosition());
		         ps.setDouble(4, employe.getSalary());
		         
		         int res=ps.executeUpdate();
		        		 c.close();
		         return res;
		         
			   
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0;
		}

	 public int updateEmploye(Employee employe) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","Mysql@123");
				
		         PreparedStatement ps=c.prepareStatement("update no1 set name=?,position=?,salary=? where id=?");
		        
		         ps.setString(1,employe.getName());
		         ps.setString(2, employe.getPosition());
		         ps.setDouble(3, employe.getSalary());
		         ps.setInt(4, employe.getId());
		         
		         int res=ps.executeUpdate();
		        		 c.close();
		         return res;
		         
			   
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0;
		}
	 public List<Employee> getEmployeInfoByAll() {
			List<Employee> li=new ArrayList<Employee>();
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","Mysql@123");
				java.sql.Statement s = c.createStatement();
				ResultSet rs=((java.sql.Statement) s).executeQuery("select * from no1");
				
				while(rs.next()) {
					Employee employe=new Employee();
					employe.setId(rs.getInt(1));
					employe.setName(rs.getString(2));
					employe.setPosition(rs.getString(3));
					employe.setSalary(rs.getDouble(4));
					
					li.add(employe);
				}
				
		         c.close();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return li;
		}
	public boolean isRes() {
		return res;
	}
	public void setRes(boolean res) {
		this.res = res;
	}
		


}



