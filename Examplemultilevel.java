package inheritance;

// Grandparent class
class Animals {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Parent class inherits from Animal
class Dogs extends Animals {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

// Child class inherits from Dog
class Puppy extends Dogs {
    void play() {
        System.out.println("Puppy is playing.");
    }
}

public class Examplemultilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Puppy myPuppy = new Puppy();
	        myPuppy.eat();  // Inherited from Animal class
	        myPuppy.bark(); // Inherited from Dog class
	        myPuppy.play(); // Defined in Puppy class

	        // In this example, Puppy inherits from Dog, which in turn inherits from Animal.
	        // This is an example of multi-level inheritance.
	    }

	}


