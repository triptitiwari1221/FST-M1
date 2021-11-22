package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		HashMap<Integer,String> mp =new HashMap<Integer,String>();
		mp.put(1, "Blue");
		mp.put(2, "Red");
		mp.put(3, "Black");
		mp.put(4, "Pink");
		mp.put(5,  "Green");
		

		System.out.println("Colors: "+mp);
		
		mp.remove(4);
		System.out.println("Colors after removing: "+mp);
				

		if(mp.containsKey(3))
		{
			System.out.println("Color Exist");
			System.out.println("Color is: "+mp.get(3));
		}
		else
		{
			System.out.println("Color do not exist");
		}
		
		System.out.println("Size: "+mp.size());
		
	}

}
