
public class Main {

	public static void main(String[] args) {
		
		
		
		  BioTeacher newTeacher = new BioTeacher();
		  
		  System.out.println("The teacher name is: " +newTeacher.name + " She teaches"
		  + " "+ newTeacher.sub);
		  
		  newTeacher.teaching();
		  
		  newTeacher.notTeaching();
		  
		  newTeacher.otherActivity();
		 
		
		
		  Polymorphism animal = new Polymorphism(); 
		  Pig newPig = new Pig(); Cat newCat
		  = new Cat();
		  
		  
		  animal.animalSound(); newPig.animalSound(); newCat.animalSound();
		 
	}

}
