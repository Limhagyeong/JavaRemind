package poly.basic;

public class CastingMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent poly=new Child(); 
//		poly.ChildMethod();

		// 다운캐스팅
		Child child=(Child)poly; 		
		child.ChildMethod(); 
		
		//일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운 캐스팅 => 연산자 우선순위가 poly.ChildMethod() 우선이므로 괄호 지정 필요
		((Child)poly).ChildMethod();
	}

}
