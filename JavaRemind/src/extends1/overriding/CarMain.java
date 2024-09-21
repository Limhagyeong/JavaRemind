package extends1.overriding;

public class CarMain {
	
	public static void main(String[] args) {
		ElectricCar electricCar=new ElectricCar();
		electricCar.move(); // 오버라이딩한 메소드가 호출됨
		
		GasCar gasCar=new GasCar();
		gasCar.move(); // 부모의 메소드가 호출됨
	}

}
