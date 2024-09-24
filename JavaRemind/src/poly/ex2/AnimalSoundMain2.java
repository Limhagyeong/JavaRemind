package poly.ex2;
// 다형성의 첫번째 특징으로 서로 다른 타입을 가진 클래스들의 공통 기능을 하나로 묶어 만든 공통 타입으로 오버라이딩 시켜
// 타입의 공통성을 가지로 여러가지로 활용할 수 있다 => 하나의 매개변수로 받는것이 가능해짐

public class AnimalSoundMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] animalArr={new Dog(), new Cat(), new Cat(), new Duck()};
		
		for(Animal animal:animalArr) {
			soundOut(animal);
		}

	}
	
	//변하지 않는 부분은 메소드로 추출
	public static void soundOut(Animal animal) {
		System.out.println("동물 소리 테스트 시작");
		animal.sound();
		System.out.println("동물 소리 테스트 종료");
	}

}
