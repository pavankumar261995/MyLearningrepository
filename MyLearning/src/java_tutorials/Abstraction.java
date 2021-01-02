package java_tutorials;

public abstract class Abstraction {
	
	public int addition(int x1, int x2)
	{
		int result = x1 +x2;
		return result;
		
	}
	public abstract int subtraction(int result, int x3);
	public int multiplication(int x1, int x2)
	{
		int result_multi = x1 * x2;
		return result_multi;
		
	}

}
