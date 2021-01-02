package java_tutorials;

import java.util.Scanner;

public class Swapping_without_using_variable {
	public void swap(int x1, int x2)
	{
		x1 = x1 * x2; //x1=5, x2 = 10, x1=50
		x2 = x1 / x2; //50 / 10 = 5
		x1 = x1 / x2; //50 /5 = 10
		System.out.println("After Swapping nx1 and x2 are :"+x1+ "\t" +x2);
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter x1 and x2 numbers:");
		int x1= s.nextInt();
		int x2= s.nextInt();
		Swapping_without_using_variable obj1 = new Swapping_without_using_variable();
		obj1.swap(x1,x2);
	}

}
