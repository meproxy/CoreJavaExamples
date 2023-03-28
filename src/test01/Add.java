package test01;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Character : ");
		char d = scan.next().charAt(0);
		System.out.println(d);
		scan.close();
	}

}
