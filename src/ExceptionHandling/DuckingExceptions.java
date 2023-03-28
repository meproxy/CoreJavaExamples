package ExceptionHandling;

class Print {
	int num = 3;
	int num1 = 0;
	int result = 0;
	//writing throws Exception is good practise to let others know in program , though it is not mandotry but once written need to write it everywhere till exception is being handled
	// use of " throws Keyword "
	// we are again ducking Exception here
	public void sum() throws Exception {
		System.out.println("Devision of the Numbers");
		add(); // calling add method
	}

	// we are ducking it's exception to the place from where it has been called
	public void add(){
		result = num / num1;
		System.out.println("Result : "+result);
	}
}

public class DuckingExceptions {

	public static void main(String[] args) {
		Print obj = new Print();
		System.out.println("Devision by zero Exception Ducking");
		// Handling exception here, main method can never duck the Exception
		// Or the Exception need to be handled at the last place from where it is being called
		try {
			obj.sum(); // calling from here
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Exception got Handled");
	}
}
