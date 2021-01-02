package java_tutorials;

public class ChildClass extends ParentClass {
	
	public ChildClass()
	{
	super(2);
	System.out.println("Child default constrcvtor");
		
	}
	public ChildClass(int a)
	{
		this();
		System.out.println("Child 1 parameterized constrcvtor");
		
	}
	public ChildClass(int a, String b)
	{
		this(2, "Pavan", 'C');
		System.out.println("Child 2 parameterized constrcvtor");
		
	}
	public ChildClass(int a, String b, char c)
	{
		this(2);
		System.out.println("Child 3 parameterized constrcvtor");
		
	}
	public ChildClass(int a, String b, char c, double d)
	{
		this(2, "pavan");
	   System.out.println("Child 4 parameterized constrcvtor");
		
	}
	
	public static void main(String[] args)
	{
		ChildClass obj = new ChildClass(2, "Pavan", 'C', 3.14);
	}

}
