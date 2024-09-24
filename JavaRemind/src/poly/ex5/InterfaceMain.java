package poly.ex5;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인터페이스는 인스턴스 생성 불가
//		InterfaceAnimal interface=new InterfaceMain(); 컴파일오류
		
		Dog dog=new Dog();
		Cat cat=new Cat();
		Caw caw=new Caw();
		
		soundOut(dog);
		soundOut(cat);
		soundOut(caw);
	}
	
	//변하지 않는 부분은 메소드로 추출
		public static void soundOut(InterfaceAnimal animal) {
			System.out.println("동물 소리 테스트");
			animal.sound();
			System.out.println("동물 이동 테스트");
			animal.move();
			System.out.println("테스트 종료"); 
			System.out.println();
			
		}

}
