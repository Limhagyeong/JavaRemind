package poly.ex6;

public class Chicken extends AbstractAnimal implements Fly {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("꼬끼오");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("닭이 날아갑니다");
	}
}
