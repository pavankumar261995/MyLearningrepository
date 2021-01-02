package java_tutorials;

public class ParentClassMethodAssignment {
	
	public void Default_method()
	{
		this.three_parameterized_method(2, "pavan", 'c');
		System.out.println("Parent Default Method");
	}
	public void one_parameterized_method(int a)
	{
		this.Default_method();
		System.out.println("Parent 1 parameterized Method");
	}
	public void two_parameterized_method(int a, String b)
	{
		this.one_parameterized_method(a);
		System.out.println("Parent 2 parameterized Method");
	}
	public void three_parameterized_method(int a, String b, char c)
	{
		System.out.println("Parent 3 parameterized Method");
	}
	public void four_parameterized_method(int a, String b, char c, float d)
	{
		this.two_parameterized_method(a, "pavan");
		System.out.println("Parent 4 parameterized Method");
		
		}
	

}
