package extends1.overriding;

public class ElectricCar extends Car {
	
	// 오버라이드 어노테이션은 없어도 동작하는데 아무 문제 없음 (옵션 사항)
	// 그럼에도 얘를 쓰는 이유는 컴파일 오류를 내주기 때문 => 메소드가 정확히 오버라이드 되있는지 확인해줌
	@Override
	public void move() {
		System.out.println("전기차를 빠르게 이동합니다");
	}
	
	public void charge() {
		System.out.println("충전합니다");
	}
}
