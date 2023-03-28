package SqlDb;

import java.sql.*;

import java.util.Scanner;

public class InsertingInSchoolData {

	static String name;
	static String address;
	static String emailId;
	static String contactNo;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		InsertingInSchoolData obj = new InsertingInSchoolData();

		for (int i = 1; i < 3; i++) {
			System.out.println("Enter " + i + " Student Details   : ");

			System.out.print("Enter Name : ");
			name = scan.nextLine();

			System.out.print("Enter Address : ");
			address = scan.nextLine();
			
			System.out.print("Enter Email Id : ");
			emailId = scan.next();

			System.out.print("Enter Contact No. : ");
			contactNo = scan.next();
			
			obj.insert();
		}
		scan.close();
	}

	public void insert() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SchoolData", "root", "test");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("INSERT INTO studentdata VALUES('" + name + "', '" + address + "', '" + emailId
					+ "', '91 " + contactNo + "')");

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
