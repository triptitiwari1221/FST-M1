package activities;

interface BicycleParts {
	public int gears = 0;
	public int speed = 100;
}

interface BicycleOperations{
	public void applyBrake(int decrement);
	public void speedUp(int increment);
}

class Bicycle implements BicycleParts, BicycleOperations{
	
	public int gears;
    public int speed;
	
	public Bicycle(int gears, int speed)
	{
		this.gears=gears;
		this.speed=speed;
	}
	
	public void applyBrake(int decrement) {
		speed=speed-decrement;			
	}
	
	public void speedUp(int increment)
	{
		speed=speed+increment;
	}
	
	public String bicycleDesc()
	{
		return("No.of Gears in bicycle are: "+gears+"\nCurrent spped of bicycle is: "+speed );
	}
}

class MountainBike extends Bicycle{
	public int seatHeight;
	
	public MountainBike(int gears, int speed, int startHeight)
	{
		super(gears, speed);
		seatHeight=startHeight;
	}
	
	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}
	
	public String bicycleDesc()
	{
		return(super.bicycleDesc()+ "\nSeat height is " + seatHeight);
	}
}

public class Activity7 {

	public static void main(String[] args) {
		MountainBike mountainObj = new MountainBike(3,0,25);
		System.out.println(mountainObj.bicycleDesc());
		mountainObj.speedUp(20);
		mountainObj.applyBrake(5);

	}

}
