package poly.basic;

public class CastingMain6 {

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
	
		// 자바 16 이상부터는 변수 선언 가능해짐 (다운캐스팅이랑 같음)
		if(parent instanceof Child child) {
			System.out.println("Child 인스턴스가 맞음");
			child.ChildMethod();
		} 
	}
}