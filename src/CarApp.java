public class CarApp {

public static void main(String[] args) {
		
Car car1 = new Car();
Car car2 = new Car("Volvo", 440, 30);

//calling methods
car1.printData();
car1.accelerate();
car1.brake();
car1.printData();
car1.refuel(10);
car2.printData();
	}

} // end of CarApp class

class Car
{
	public String brand ;
	public int model;
	public int amountOfFuel;

// parameterised constructor
public Car(String brandName, int modelName, int fuel)
	{
		brand = brandName;
		model = modelName;
		amountOfFuel = fuel;
	}
// default constructor 
public Car()
{
	brand = "";
	model = 0;
	amountOfFuel = 0;
	
}

public void brake()
{
	System.out.println("Car is breaking");
}
public void accelerate()
{
System.out.println("Car is accelerating");
if (amountOfFuel > 0)
{
amountOfFuel --;
}
}
public void printData()
{
	System.out.println("Brand " +brand);
	System.out.println("Model " + model);
	System.out.println("Fuel " + amountOfFuel);
}
public void refuel(int amount)
{
	int afterRefuel = amountOfFuel + amount;
	System.out.println("Fuel on tank: " + amountOfFuel);
	System.out.println("Refuel: " + amount);
	System.out.println("Fuel on the tank after the refuel: " + afterRefuel);
	
	
}



}
