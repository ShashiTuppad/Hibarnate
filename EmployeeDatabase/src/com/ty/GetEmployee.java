package com.ty;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class GetEmployee {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	    System.out.println("enter the employee phno");
	    int	phno=scanner.nextInt();
	    System.out.println("enter the employee salary");
		   double	salary=scanner.nextDouble();
	    
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("select * from employee where phno=(?) and salary=(?) ");
			preparedStatement.setInt(1,phno);
			preparedStatement.setDouble(2,salary);
			ResultSet resultset=preparedStatement.executeQuery();
			while(resultset.next())
			{
				System.out.println("Employe Id is: "+resultset.getInt(1));
				System.out.println("Employe Name is: "+resultset.getString(2));
				System.out.println("Employe Age is: "+resultset.getInt(3));
				System.out.println("Employe Salary is: "+resultset.getDouble(4));
				System.out.println("Employe Phno is: "+resultset.getInt(5));
				System.out.println("Employe Designation is: "+resultset.getString(6));
				
				
			}
//			resultset.close();
			connection.close();	
			System.out.println("getting data");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}


}