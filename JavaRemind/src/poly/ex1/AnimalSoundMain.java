package poly.ex1;

public class AnimalSoundMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		Cat cat=new Cat();
		Caw caw=new Caw();
		
		// 타입이 전부 다르기때문에 중복 코드를 제거하는것에 어려움이 있음
		// => 하나의 타입으로 묶는다면 해결 가능
		
		System.out.println("동물 소리 테스트 시작");
		dog.sound();
		System.out.println("동물 소리 테스트 종료");
		
		System.out.println("동물 소리 테스트 시작");
		cat.sound();
		System.out.println("동물 소리 테스트 종료");
		
		soundCaw(caw); // cat, dog는 담을 수 없음
	}
	
	private static void soundCaw(Caw caw) {
		System.out.println("동물 소리 테스트 시작");
		caw.sound();
		System.out.println("동물 소리 테스트 종료");
	}

}
