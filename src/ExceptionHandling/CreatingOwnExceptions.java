package ExceptionHandling;

class MyException extends Exception()
{

	public MyException(){
		
	}
}

public class CreatingOwnExceptions {

	public class Calling {
		public static void main(String[] args) {
			int num = 7;
			int num1 = -3;
			try {
				if (num1 < 0) throw new ArithmeticException("Denominator need to be +ve");
				else {
					int result = num / num1;
					System.out.println("Result :" + result);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Exception Handeled");
			}
		}
	}
}
