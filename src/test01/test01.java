package test01;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Name : ");
		String name = scan.nextLine();
		
		System.out.print("Enter Address : ");
		String address = scan.next();
		
		System.out.print("Enter Email Id : ");
		String emailId = scan.next();
		
		System.out.print("Enter Contact No. : ");
		String contactNo = scan.next();
	}

}
