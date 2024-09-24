package poly.ex6;
// 상속은 하나만 할 수이 ㅆ고
public class Bird extends AbstractAnimal implements Fly {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("짹짹");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("새가 날아갑니다");
	}


}
