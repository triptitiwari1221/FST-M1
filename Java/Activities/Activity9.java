package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		
		myList.add("Hyderabad");
		myList.add("Banglore");
		myList.add("Delhi");
		myList.add(3, "Mumbai");
		myList.add(1, "Chennai");
		
		System.out.println("Elements in Array are: ");
		for(String s:myList){
            System.out.println(s);
        }
		System.out.println("The 3rd name in array is: "+myList.get(2));
		System.out.println("Is Hyderabad in list"+myList.contains("Hyderabad"));
		System.out.println("Total List: "+myList.size());
		myList.remove("Chennai");
		System.out.println("Total List after removing an element: "+myList.size());
		System.out.println("Elements in Array after removing an element: "+myList);

	}

}
