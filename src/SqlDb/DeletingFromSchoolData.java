package SqlDb;

import java.sql.*;
import java.util.Scanner;

public class DeletingFromSchoolData {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the NAme whose data is to be Deleted : ");
			String name = scan.nextLine();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SchoolData", "root", "test");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("DELETE FROM studentdata WHERE Name = '" + name + "'");
			con.close();
			scan.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}