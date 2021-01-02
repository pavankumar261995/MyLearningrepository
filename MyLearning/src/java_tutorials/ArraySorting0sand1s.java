package java_tutorials;


public class ArraySorting0sand1s {
	
	static void sorting(int[] arr)
	{
		for(int i=0;i<(arr.length);i++)
		{
			for(int j=0;j<(arr.length-1);j++) {

			if(arr[j]>arr[j+1])
			{
				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j]= temp;
			}
			}
		}
	}

	public static void main(String[] args) {
		int array[] = {0,1,0,1,0,0,1};
		sorting(array);
		System.out.println("After Sorting");
		for(int i=0;i<array.length;i++) 
		{
			System.out.print(array[i]);
		}

	}

}
