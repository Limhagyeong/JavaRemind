package poly.ex2;

public class AnimalSoundMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a=new Animal();
		a.sound(); // => 추상적 개념을 가지고있는 클래스의 객체를 생성해서 사용할 일은 거의 없음
		
		Animal[] animalArr={new Dog(), new Cat(), new Cat(), new Duck(), new Pig()};
		
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
