package java_tutorials;

public class ChildClassMethodAssignment extends ParentClassMethodAssignment {
	public void Child_Default_method()
	{
		super.four_parameterized_method(2, "pavan", 'c', 6);
		System.out.println("child Default Method");
	}
	public void Child_one_parameterized_method(int a)
	{
		this.Child_three_parameterized_method(2, "pavan", 'c');
		System.out.println("child 1 parameterized Method");
	}
	public void Child_two_parameterized_method(int a, String b)
	{
		this.Child_one_parameterized_method(2);
		System.out.println("child 2 parameterized Method");
	}
	public void Child_three_parameterized_method(int a, String b, char c)
	{
		this.Child_Default_method();
		System.out.println("child 3 parameterized Method");
	}
	public void Child_four_parameterized_method(int a, String b, char c, float d)
	{
		this.Child_two_parameterized_method(2, "pavan");
		System.out.println("child 4 parameterized Method");
		
	}

	public static void main(String[] args) {
		ChildClassMethodAssignment obj = new ChildClassMethodAssignment();
		obj.Child_four_parameterized_method(2, "pavan", 'c', 6);
	}
}
