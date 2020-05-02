package hello_world;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello World, We are testing the Eclipse IDE !");
		
		
		  // Object creation for vehicle class
		  
		  Vehicle vehicleObj = new Vehicle();
		  
		  String car = vehicleObj.driving(); 
		  System.out.println("The car " +
		  vehicleObj.Name + ", " + car );
		  
		  vehicleObj.notDriving();
		 
		
		
		
		
	}

}
