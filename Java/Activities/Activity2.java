package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {

		int arrRef[] = {10, 77, 10, 54, -11, 10};
		
		System.out.println("Original Array: " + Arrays.toString(arrRef));
		
		int total = 30;
		int check = 10;
				
		System.out.println("Result: "+result(arrRef, total, check));
		
	}
	
	public static boolean result(int arrRef[], int total, int check)
	{
		int sum=0;
		
		for(int i=0; i<arrRef.length;i++)
		{
			if(arrRef[i]==check)
			{
				sum=sum+arrRef[i];
			}
			
			if(sum>total)
			{
				break;
			}
		}
		return sum==total;
	}

}
