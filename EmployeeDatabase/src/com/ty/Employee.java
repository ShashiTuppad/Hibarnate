package com.ty;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the employee id");
	    int	id=scanner.nextInt();
	    System.out.println("enter the employee name");
	    String	name=scanner.next();
	    System.out.println("enter the employee age");
	    int	age=scanner.nextInt();
	    System.out.println("enter the employee salary");
	   double	salary=scanner.nextDouble();
	    System.out.println("enter the employee phno");
	    int	phno=scanner.nextInt();
	    System.out.println("enter the employee designation");
	    String designation=scanner.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			preparedStatement.setInt(1,id);
			preparedStatement.setString(2,name);
			preparedStatement.setInt(3,age);
			preparedStatement.setDouble(4,salary);
			preparedStatement.setInt(5,phno);
			preparedStatement.setString(6,designation);
			preparedStatement.execute();
			connection.close();			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}
