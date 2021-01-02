package java_tutorials;

import java.util.Scanner; 

public class Input extends Abstraction {
	
	public int subtraction(int result, int x3)    
	{
		int result_sub = result - x3;
		return result_sub;
	}
	public int division(int result, int x6)    
	{
		int result_div = result / x6;
		return result_div;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values for x1:");
		int x1 =s.nextInt();
		System.out.println("Enter the values for x2:");
		int x2 =s.nextInt();
		System.out.println("Enter the values for x3:");
		int x3 =s.nextInt();
		System.out.println("Enter the values for x4:");
		int x4 =s.nextInt();
		System.out.println("Enter the values for x5:");
		int x5 =s.nextInt();
		System.out.println("Enter the values for x6:");
		int x6 =s.nextInt();
		Input obj1 = new Input();
		int addition_result = obj1.addition(x1, x2);
		int subtraction_result = obj1.subtraction(addition_result,x3);
		addition_result = obj1.addition(subtraction_result, x4);
		int multiplication_result = obj1.multiplication(addition_result,x5);
		int Divison_result = obj1.division(multiplication_result,x6);
		System.out.println("Final result for (((((x1+x2)-x3)+x4)*x5)/x6) is:" +Divison_result);

		
		}



}
