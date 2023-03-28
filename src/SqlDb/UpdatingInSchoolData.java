package SqlDb;

import java.sql.*;

import java.util.Scanner;

public class UpdatingInSchoolData {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter Your Name : ");
			String name = scan.nextLine();
			System.out.print("Enter Your New Contact Number : ");
			String contactNo = scan.next();
			System.out.println("Enter your new Address : ");
			String address1 = scan.next();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SchoolData", "root", "test");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("UPDATE studentdata SET Contact_No = '" + contactNo + "', Address = '"+address1+"' WHERE Name = '" + name + "'");

			con.close();
			scan.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}