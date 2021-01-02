package java_tutorials;

public class Method_assignment {
	
	public void default_method()
	{
		System.out.println("Default method");
		this.two_parameterized_method(4, 'z');

	}
	public void one_parameterized_method(int a)
	{
		System.out.println("1 parameterized method");

	}
	public void two_parameterized_method(int a, char b)
	{
		System.out.println("2 parameterized method");
		this.three_parameterized_method(3, 'x', "string");


	}
	public void three_parameterized_method(int a, char b, String c)
	{
		System.out.println("3 parameterized method");
		this.one_parameterized_method(2);

	}
	public void four_parameterized_method(int a, char b, String c, double d)
	{
		System.out.println("4 parameterized method");
		this.default_method();

	}

	public static void main(String[] args) {
		Method_assignment obj1 = new Method_assignment();
		obj1.four_parameterized_method(1, 'b', "string", 2.10);
		
	}
}
