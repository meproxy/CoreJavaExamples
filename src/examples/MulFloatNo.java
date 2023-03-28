package examples;

import java.util.Scanner;
// Multiply Float No.'s
public class MulFloatNo {
	float i = 22.3f;

	public static void main(String[] args) {
		MulFloatNo obj = new MulFloatNo();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 2nd No. : ");
		float j = scan.nextFloat();
		float l = obj.i * j;
		System.out.println(obj.i + " * " + " = " + l);
		scan.close();

	}

}
