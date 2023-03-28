package ExceptionHandling;

class Print2 {
	int num = 3;
	int num1 = 0;
	int result = 0;
	int arr [] = {2, 23, 3};
	public void div() throws Exception {
		result = num/num1;
		System.out.println("Result :" + result);
	}
	public void arrCall() throws Exception {
		System.out.println(arr[5]);
	}
}

public class DuckingExceptions02 {

	public static void main(String[] args) {
		Print2 obj = new Print2();
		System.out.println("Handling Two different Exceptions at one place");
		try {
			obj.div();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Exceptions got handled properly");
	}
}
