package poly.basic;

public class CastingMain5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent1=new Parent();
		System.out.println("parent1 호출");
		call(parent1);
		
		Parent parent2=new Child();
		System.out.println("parent2 호출");
		call(parent2);
	}

	private static void call(Parent parent) {
		
		parent.parentMathod();
		
		// 부모타입의 매개변수가 어떤 객체인지 검증하여 다운캐스팅 가능
		// Child 인스턴스의 경우 ChildMethod() 실행
		if(parent instanceof Child) {
			System.out.println("Child 인스턴스가 맞음");
			((Child) parent).ChildMethod();
		} 
	}
}