package DecoratePattern;

public class CoffeeTest {
	
	public static void main(String[] args) {
		
		Coffee americano = new Americano();
		americano.brewing();
		
		Coffee milk = new Milk(americano);
		milk.brewing();
		
		//Coffee sugar = new Sugar(milk);
		Coffee sugar = new Sugar(new Milk(new Americano()));
		sugar.brewing();
		
		
	}
}
