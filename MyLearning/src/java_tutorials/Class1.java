package java_tutorials;

public class Class1{
	public void meth1()
	//public static void main(String[] args)
	{
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
	       System.out.print(i);
		}
	System.out.println("");
	
	}
}

	public static void main(String[] args)
	{
		Class1 obj1 = new Class1();
		Class2 obj2 = new Class2();
	    obj1.meth1();
		obj2.meth2();

}
	


}
