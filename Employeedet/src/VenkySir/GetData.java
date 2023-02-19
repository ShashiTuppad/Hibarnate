package VenkySir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GetData {
		public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedet","root","root");
				 Statement statement= connection.createStatement();
//				 statement.executeQuery("select * from Employee where eid=101");
				 System.out.println(statement.executeQuery("select * from Employee where eid=101"));
				 connection.close();
				 System.out.println("Data Updated");
				
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}

	}

}
