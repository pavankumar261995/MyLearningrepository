package java_tutorials;

public class Stud {
	
	int age;
	int roll_no;
	
	public void student_details1(){
		System.out.println("Age is " + age);
		
	}
	
	public void student_details2(){
		System.out.println("Roll no is  "+ roll_no);
		
	}
	public static void main (String[] args)
	{
	
		Stud obj1 = new Stud();
		obj1.age = 15;
		obj1.roll_no = 123;
		obj1.student_details1();
		obj1.student_details2();
		
	}

}
