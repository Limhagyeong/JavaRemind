package poly.car1;
// 해당 패키지가 OCP원칙을 잘 지키고 있음을 보여줌
// 확장에는 열려있다
// 비즈니스 로직을 수행하는 코드는 전혀 건들이지 않음
public class NewCar implements Car{

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("newcar");
	}

	@Override
	public void offEngine() {
		// TODO Auto-generated method stub
		System.out.println("newcar");
	}

	@Override
	public void pressAccelrator() {
		// TODO Auto-generated method stub
		System.out.println("newcar");
	}

}
