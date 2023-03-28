package examples;

import java.util.Scanner;
// Adding Numbers
public class AddingNumbers {
	int i = 22;
	int j = 44;
	int k;

	public static void main(String[] args) {
		AddingNumbers obj = new AddingNumbers();
		Scanner scan = new Scanner(System.in);
		obj.k = obj.i + obj.j;
		System.out.println(obj.i + " + " + obj.j + " = " + obj.k);
		System.out.print("Enter 1st No. : ");
		int l = scan.nextInt();
		System.out.print("Enter 2nd No. : ");
		int m = scan.nextInt();
		int n = l + m;
		System.out.println(l + " + " + m + " = " + n);
		scan.close();

	}

}
