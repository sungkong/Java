package DecoratePattern;

public class Sugar extends Decorator {

	public Sugar(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing() {
		super.brewing();
		System.out.println("Adding Sugar");
	}
	
}
