package com.ty;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class UpdateEmployee {
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	
	    System.out.println("enter the employee id who You want to change the name");
	    int	id=scanner.nextInt();
	    System.out.println("enter the Updeted employee name");
	    String	name=scanner.next();
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("update employee set name=(?) where id=(?) ");
			
			preparedStatement.setString(1,name);
			preparedStatement.setInt(2,id);
			preparedStatement.execute();
			connection.close();	
			System.out.println("updated");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}


}
