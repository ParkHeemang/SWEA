package practice0104;

public class Lion extends Predator implements Barkable{


	
	public void bark() {		
		System.out.println("À¸¸£··");
	}

	@Override
	public String getFood() {
		
		return "banana";
	}

}
