
public class Vehicle {

	// fields

	String brand = "Tesla ";

	// methods

	void honk() {

		System.out.println("Beep Beep !!");

	}
}

class Cars extends Vehicle {

	String modelName = "Model 3";

	public static void main(String[] args) {

		Cars myCar = new Cars();

		System.out.println("My car brand is : " + myCar.brand + "& name is : " + myCar.modelName);

		myCar.honk();

	}

}
