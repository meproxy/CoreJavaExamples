package examples;

import java.util.Scanner;
// Printer Integers entered by User
public class PrintingInteger {
		int j = 33;
	public static void main(String[] args) {
		int i = 22;
		PrintingInteger obj = new PrintingInteger();
		System.out.println(i);
		System.out.println(obj.j);
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int k = scan.nextInt();
		System.out.println(k);
		scan.close();
	}

}
