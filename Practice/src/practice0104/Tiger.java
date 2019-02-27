package practice0104;

public class Tiger extends Predator implements Barkable{


	
	public void bark() {
		
		System.out.println("¾îÈï");
	}

	@Override
	public String getFood() {
		
		return "apple";
	}
	


}
