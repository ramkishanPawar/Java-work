
// method overriding or polymorphism

public class Polymorphism {
	
	void animalSound() {
		
		System.out.println("The animal makes sound !");
		
	}

}


class Pig extends Polymorphism{
	
void animalSound() {
		
		System.out.println("The pig oinks !");
		
	}
		
}

class Cat extends Polymorphism{
	
void animalSound() {
		
		System.out.println("The CAt Meows !");
		
	}
		
}
