package VenkySir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Employee {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection  connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedet","root","root");
			Statement statement=connection.createStatement();
//			statement.execute("insert into employee values(101,'Shashi',10000,'Software Developer')");
//			statement.execute("insert into employee values(102,'jaani',40000,'Software Developer')");
			statement.execute("insert into employee values(103,'karthik',50000,'Software Developer')");
			
			connection.close();
			System.out.println("Data Stored");
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
