package java_tutorials;

import java.util.Scanner;

public class Swapping_using_variable {
	int a,b,c;
	
	public void swap(int a1,int a2)
	{
		a = a1;
		b = a2;
		c = a;
		a = b;
		b = c;
		System.out.println("Before swapping a1 and a2 values are:" +a   +b);
		
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num1:");
		int a1 = s.nextInt();
		System.out.println("Enter num2:");
		int a2 = s.nextInt();
		System.out.println("Before swapping a1 and a2 values are:" +a1   +a2);
		Swapping_using_variable obj1 = new Swapping_using_variable();
		obj1.swap(a1,a2);
		
	}

}
