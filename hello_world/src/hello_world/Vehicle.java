package hello_world;

// class Vehicle
public class Vehicle {
	
	String Name;
	int power;
	int speed;

	// methods
	
	String driving() {
		
		return "The car is running !" ;
		
	}
	
	void notDriving() {
		
		System.out.println("The car is stopped.");
		
	}
	
	// constructor
	
	Vehicle(){
		
		Name = "Indica";
		power = 600;
		speed = 40;
		
	}
	
	
}
