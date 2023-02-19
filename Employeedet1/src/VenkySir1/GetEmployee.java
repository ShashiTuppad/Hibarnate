package VenkySir1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetEmployee {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the employee phono");
		int phno=scanner.nextInt();
		System.out.println("Enter the employee salary");
		double salary=scanner.nextDouble();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosys","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("select * from infosys where phno=(?) and salary>(?)");
			preparedStatement.setInt(1, phno);
			preparedStatement.setDouble(2, salary);
			ResultSet resultset=preparedStatement.executeQuery();
			while(resultset.next()) {
				System.err.println(resultset.getInt(1));
			}
			connection.close();
			System.out.println("Getting Data");
		} 

		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
