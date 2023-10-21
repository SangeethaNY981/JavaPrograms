package interfaces;


class Animal1 {
    void eat() {
        System.out.println("Animal is eating.");
    }
}
interface Swim{
  abstract void Swimming();
  }

interface Fly{
	abstract void Flying();
}

class Fish extends Animal1 implements Swim {

	@Override
	public void Swimming() {
		System.out.println("Fishing is Swimming");
	}

}
class Bird extends Animal1 implements Fly {
	@Override
	public void Flying() {
		System.out.println("Bird is Flying");
		
	}
}
public class ExampleHybrid1 {

	public static void main(String[] args) {
		  
		   Fish ob =new Fish();
		   Bird ob1 =new Bird();
		   ob.eat();
	       ob.Swimming();
	       ob1.eat();
	       ob1.Flying();

	       
	}

}


