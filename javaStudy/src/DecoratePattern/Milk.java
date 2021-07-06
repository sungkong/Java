package DecoratePattern;

public class Milk extends Decorator{

	public Milk(Coffee coffee) {
		super(coffee); // 상위 클래스에 default 생성자가 없기 때문에 명시적으로 호출.
	}

	public void brewing() {
		super.brewing();
		System.out.println("Adding Milk ");
	}
}
