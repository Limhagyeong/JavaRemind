package poly.car1;
// 수정에는 닫혀있고
public class Driver {
	private Car car;
	
	public void setCar(Car car) {
		System.out.println("자동차를 설정");
		this.car=car;
		System.out.println(car);
		
		
	}
	
	public void drive() {
		System.out.println("자동차를 운전");
		car.startEngine();
		car.pressAccelrator();
		car.offEngine();
	}
}
