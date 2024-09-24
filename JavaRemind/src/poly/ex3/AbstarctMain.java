package poly.ex3;

// 추상 클래스를 사용하면 실수로 부모 인스턴스를 생성할 문제를 근복적으로 방지해줌
// 부모클래스의 메소드를 오버라이딩하지 않을 가능성을 근복적으로 방지해줌
public class AbstarctMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 추상 클래스는 인스턴스 생성 불가
//		AbstarctAnimal animal=new AbstarctAnimal(); 컴파일 오류
		
		Dog dog=new Dog();
		Cat cat=new Cat();
		Caw caw=new Caw();
		
		cat.sound();
		cat.move();
		
		soundOut(dog);
		soundOut(caw);
	}
	
	//변하지 않는 부분은 메소드로 추출
		public static void soundOut(AbstarctAnimal animal) {
			System.out.println("동물 소리 테스트 시작");
			animal.sound();
			animal.move();
			System.out.println("동물 소리 테스트 종료"); 
			
		}


}
