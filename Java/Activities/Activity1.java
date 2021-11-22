package activities;

import org.xml.sax.EntityResolver;

public class Activity1 {

	public static void main(String[] args) {
			
		Car carObj = new Car();
		
		carObj.make=2014;
		carObj.color = "Black";
		carObj.transmission = "Manual";
		
		carObj.displayCharacteristics();
		carObj.accelerate();
		carObj.brake();
	
	
	}
}
