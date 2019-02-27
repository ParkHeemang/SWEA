package practice0104;

public class Bouncer {
	
	public void barkAnimal(Animal animal) {
		
		animal.bark();
	}

	public static void main(String[] args) {
		Animal tiger = new Tiger();		
		Animal lion = new Lion();
		
		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);

	}

}
