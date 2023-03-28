package test01;

import java.sql.*;

public class DatabaseSql {

	public static void main(String[] args) {
		try {
//			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sample", "root", "test");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/set02", "root", "test");
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate("INSERT INTO Collections VALUES('Tommy', 'Vadodra', 'tom@gmail.com', '57643333567')");
			stmt.executeUpdate("");
			stmt.executeUpdate("");
			
			con.close();			
		} catch (Exception e) {
			e.printStackTrace();			
		}
	}
}
