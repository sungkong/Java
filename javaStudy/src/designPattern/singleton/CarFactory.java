package designPattern.singleton;

public class CarFactory {

		
		private static CarFactory instance = new CarFactory(); 
		// 객체 생성 전 미리 초기화를 시킴.(static이라 메모리에 계속 상주). 
		// 다중 쓰레드에서 인스턴스가 2개이상 생성되는거 방지(경합 조건[Race Condition] 방지)
		
		private CarFactory() {} // 외부에서 생성자 접근하지 못하게. 생성장히 하니면 컴파일러가 default 생성자를 생성함.(public으로)
		
		
		
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}

	
	public Car createCar() {
		Car car = new Car();
		return car;
	}
}
