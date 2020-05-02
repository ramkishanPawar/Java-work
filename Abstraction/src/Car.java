
// Subclass car extends Vehicle Class
 class Car extends Vehicle {
	 
	 // Using abstract method here
	 
	 public void vehicleBrand() {
		 
		 System.out.println("The brand name is : Tesla ");
		 
	 }
	 
	 // Main method starts here
	 
	 public static void main(String[] args) {
		 
		 // object creation 
		 
		 Car myCar = new Car();
		 
		 myCar.vehicleBrand();
		 myCar.vehicleSpeed();
		 
		 
	 }

}
