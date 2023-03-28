package test01;

import java.sql.*;
import java.util.Scanner;

public class DatabaseSql2 {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Table Name : ");
			String t1 = scan.next();

			System.out.print("Enter 1st Column Name : ");
			String c1 = scan.next();
			System.out.print("Enter 2nd Column Name : ");
			String c2 = scan.next();
			System.out.print("Enter 3rd Column Name : ");
			String c3 = scan.next();
			System.out.print("Enter 4th Column Name : ");
			String c4 = scan.next();

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test03", "root", "test");

			Statement stmt = con.createStatement();
			String sql = "CREATE TABLE " + t1 + "" + "(" + c1 + " VARCHAR(30)," + "" + c2 + " VARCHAR(50)," + "" + c3
					+ " VARCHAR(40)," + "" + c4 + " VARCHAR(12))";

			stmt.executeUpdate(sql);

			con.close();
			scan.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
