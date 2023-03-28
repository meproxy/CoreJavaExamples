package SqlDb;

import java.sql.*;

public class CreatingSchoolData {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SchoolData", "root", "test");

			Statement stmt = con.createStatement();
			String sql = "CREATE TABLE StudentData" + "(Name VARCHAR(30)," + "Address varchar(50),"
					+ "EmailID varchar(40)," + "Contact_No varchar(12))";

			stmt.executeUpdate(sql);

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
