package inheritance;

class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Child class 1 inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

// Child class 2 inherits from Animal
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing.");
    }
}

public class HirarchicalInheritanceExamp {

	public static void main(String[] args) {
		
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.eat();  // Inherited from Animal class
        myDog.bark(); // Defined in Dog class

        myCat.eat();  // Inherited from Animal class
        myCat.meow(); // Defined in Cat class

        // In this example, both Dog and Cat inherit from the common base class Animal.
        // This is an example of hierarchical inheritance.
    }
}


		