package java_tutorials;

public class Constructor_assignment {
	int a,b,c,d;
	
	public Constructor_assignment()
	{
		this(1,2,3,4);
		System.out.println("Default constructor");
	}
	public Constructor_assignment(int a,int b,int c, int d)
	{
		
		System.out.println("4 four parameterized constructor");

	}
	public Constructor_assignment(int a,int b,int c)
	{
		this(1);
		System.out.println("3 parameterized constructor");

	}
	public Constructor_assignment(int a,int b)
	{
		this(1,2,3);
		System.out.println("2 parameterized constructor");

	}
	public Constructor_assignment(int a)
	{
		this();
		System.out.println("1 parameterized constructor");

	}
	public static void main(String[] args) {
		Constructor_assignment obj1 = new Constructor_assignment(1,2);
		
	}

}
