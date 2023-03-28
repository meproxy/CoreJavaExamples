package ExceptionHandling;

public class CustomException03 {

	public static void main(String[] args) {
		int num = 33;
		int num1 = -5;
		int result = 0;
		try {
			//Use Logic's & Decrease LOC
			if (num1 < 0) throw new ArithmeticException("Denominator need to be Positive");
			else {
				result = num / num1;
				System.out.println("Result :" + result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Feed +ve Denominator");
		}
	}
}
