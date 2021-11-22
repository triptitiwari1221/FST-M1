package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		HashSet<String> hs= new HashSet<String>();
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("d");
		hs.add("e");
		hs.add("f");
		
		System.out.println("Size of HashSet: "+hs.size());
		hs.remove("a");
		if(hs.contains("g"))
		{
			System.out.println("ELement g is removed: "+hs.remove("g"));
		}
		else
		{
			System.out.println("Element is not in the set");
		}
		
		System.out.println("Is element c Present in set: "+hs.contains("c"));
		System.out.println("Updated Set:");
		for(String s:hs)
		{
			System.out.println(s);
		}
		

	}

}
