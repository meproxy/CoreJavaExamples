package examples;

import java.util.Scanner;

//Printing ASCII value of given character
public class Ascii {
	char c = 'a';
	char d = 'z';

	public static void main(String[] args) {
		Ascii obj = new Ascii();
		int i = obj.c;
		int j = obj.d;
		System.out.println("ASCII value of '" + obj.c + "' is : " + i);
		System.out.println("ASCII value of '" + obj.d + "' is : " + j);
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Character : ");
		char d = scan.next().charAt(0);
		int e = d;
		System.out.println("ASCII value of character '" + d + "' is : " + e);
		scan.close();
	}

}
