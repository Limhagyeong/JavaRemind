package poly.ex2;
// 다형성의 첫번째 특징으로 서로 다른 타입을 가진 클래스들의 공통 기능을 하나로 묶어 만든 공통 타입으로 오버라이딩 시켜
// 타입의 공통성을 가지로 여러가지로 활용할 수 있다 => 하나의 매개변수로 받는것이 가능해짐

public class AnimalSoundMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		Cat cat=new Cat();
		Caw caw=new Caw();
		Duck duck=new Duck();
		
		soundOut(dog);
		soundOut(cat);
		soundOut(caw);
		soundOut(duck);
	}
	private static void soundOut(Animal animal) { // 부모는 자식을 담을 수 있음
		System.out.println("동물 울음소리 테스트 시작");
		animal.sound(); // 오버라이딩 된 메소드가 우선순위를 가짐
		System.out.println("동물 울음소리 테스트 종료");
	}

}
