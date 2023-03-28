package ExceptionHandling;

public class CustomException02 {

	public static void main(String[] args) {
		int num = 22;
		int num1 = -2;
		int result = 0;
		try {
			if (num1 < 0) {
				// we are calling explicitly soo whatever we will call will be thrown
				Exception e = new ArithmeticException("Feed a +ve Denominator");
				throw e;
			} else {
				result = num / num1;
				System.out.println("Result :" + result);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Rectify Num1");
		}
	}
}
