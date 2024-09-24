package poly.ex3;

public abstract class AbstarctAnimal {
	
	public abstract void sound(); // 메소드 바디가 없음 => 작동하지 않는 메소드
	// 추살 클래스를 상속받는 자식 클래스는 추상 메소드를 반드시 구현해야함 => 바디가 없어도 되는 이유

	// 추상 메서드는 기존 메소드와 완전히 같지만
	// 메서드 바디가 없고, 자식 클래스가 해당 메소드를 반드시 구현해야한다는 제약이 추가된 것
	
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}
	
