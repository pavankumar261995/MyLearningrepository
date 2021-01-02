package java_tutorials;

public class BubbleSort {
	
	public static void bubbsort(int[] array, int x)
	{
		//int n = array.length;
		int temp = 0;
		for(int i=0;i<x;i++)
		{
			for(int j=1;j<x;j++)
			{
				if(array[j-1]>array[j])
				{
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
					
				}
			}
			}
			
	}

	public static void main(String[] args) {
		int array[] = {-2,4,6,-4,8,-3};
		System.out.println("Before bubble sort");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(" "+array[i]);
		}
		System.out.println("\nAfter bubble sort");
		int n = array.length;
		bubbsort(array,n);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(" "+array[i]);
		}
	}

}
