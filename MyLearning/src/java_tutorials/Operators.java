package java_tutorials;

public class Operators {
	
	public int multiplication(int a,int b)
	{
		int c = a*b;
		System.out.println("Multiplication result for " + a + "*" + b +"=" + c);
		return c;  
	}
	public int addition(int a,int b)
	{
		int c = a+b;
		System.out.println("Addition result is " + a + "+" + b +"=" + c);
		return c;
	}
	public int subtraction(int a,int b)
	{
		int c = a-b;
		System.out.println("Subtraction result is " + a + "-" + b +"=" + c);
		return c;
	}
	public void division(int a,int b)
	{
		int c = a/b;
		System.out.println("Final result after divison of " + a + "/" + b +"=" + c);

	}
	public static void main(String[] args) {
		Operators obj1 = new Operators();
		int multi_result = obj1.multiplication(10,2);
		int addition_result = obj1.addition(multi_result, 2);
		int subtraction_result = obj1.subtraction(addition_result, 2);
		addition_result = obj1.addition(subtraction_result, 2);
		obj1.division(addition_result, 2);
	}

}
