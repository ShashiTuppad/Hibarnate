package com.ty;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class DeleteEmployee {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the employee id");
	    int	id=scanner.nextInt();
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("delete from employee where id=(?) ");
			preparedStatement.setInt(1,id);
			preparedStatement.execute();
			connection.close();			
		}
	    catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}