package designPattern.singleton;


public class Car {
	
		
		private static int serialNum = 10000;
		private int carNum;
		
		public Car() {
			serialNum++;
			carNum = serialNum;
		}
		
		public int getCarNum() {
			return carNum;
		}

		public void createCarNum(int carNum) {
			this.carNum = carNum;
		}
	
}
