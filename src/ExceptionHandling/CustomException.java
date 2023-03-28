package ExceptionHandling;

public class CustomException {

	public static void main(String[] args) {
		int num = 2;
		int num1 = -2;
		int result = 0;
		try {
			// Use throw keyword for explicitly applying conditions on an Statment to throw Exception
			if (num1 < 0) {
				Exception e = new Exception();
				throw e;
			} else {
				result = num / num1;
				System.out.println("Result :" + result);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Feed the denominator greater than Zero");
		}
	}
}
