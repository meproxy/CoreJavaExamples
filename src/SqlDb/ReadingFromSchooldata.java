package SqlDb;
import java.sql.*;

public class ReadingFromSchooldata {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SchoolData", "root", "test");
			System.out.println(con);
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("SELECT * FROM studentdata");
			while(result.next()) {
				System.out.print(result.getString(1)+"  ");
				System.out.print(result.getString(2)+"  ");
				System.out.print(result.getString(3)+"  ");
				System.out.print(result.getString(4));
				System.out.println();
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
