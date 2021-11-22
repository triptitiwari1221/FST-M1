package activities;

public class Car {
	
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car()
	{
		tyres = 4;
		doors = 4;
	}
	
	public void displayCharacteristics()
	{
		System.out.println("The color of the Car is: "+color);
		System.out.println("The transmission of the Car is: "+transmission);
		System.out.println("The make of the Car is: "+make);
		System.out.println("The tyres of the Car is: "+tyres);
		System.out.println("The doors of the Car is: "+doors);
	}
	
	public void accelerate() 
	{
		System.out.println("Car is moving forward.");
    }
	
    public void brake()
    {
    	System.out.println("Car has stopped.");
    }

}
