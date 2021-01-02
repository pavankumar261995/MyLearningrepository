package java_tutorials;

public class ParentClass {
	
	public ParentClass()
	{
		this(2, "pavan");
		System.out.println("Parent default constrcvtor");
		
	}
	public ParentClass(int a)
	{
		this(2, "pavan", 'c');
		System.out.println("Parent 1 parameterized constrcvtor");
		
	}
	public ParentClass(int a, String b){
		
		System.out.println("Parent 2 parameterized constrcvtor");
		
	}
	public ParentClass(int a, String b, char c)
	{
		this(2, "pavan", 'c', 3.14);
		System.out.println("Parent 3 parameterized constrcvtor");
		
	}
	public ParentClass(int a, String b, char c, double d)
	{
		this();
		System.out.println("Parent 4 parameterized constrcvtor");
		
	}

}
