package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {

		int numbers[] = {4,3,2,10,12,1,5,11,6,7};
		System.out.println("Arrays Before Sorting: ");
	    System.out.println(Arrays.toString(numbers));
		numSorting(numbers);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(numbers));

	}
	
	static void numSorting(int numbers[])
	{
		for(int i=1;i<numbers.length;i++) {
			
			int key = numbers[i];
            int j = i - 1;
            
            while (j >= 0 && key < numbers[j]) {
            	numbers[j + 1] = numbers[j];
                --j;
            }
            numbers[j + 1] = key;
			
		}
	}

}
