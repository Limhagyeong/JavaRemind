package poly.basic;

public class PolyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 부모 변수가 부모 인스턴스 참조
		System.out.println("Parent -> Parent");
		Parent parent=new Parent();
		parent.parentMathod();
		
		// 자식 변수가 자식 인스턴스 참조
		System.out.println("Child => Child");
		Child child=new Child();
		child.parentMathod();
		child.ChildMethod();
		
		// 부모 변수가 자식 인스턴스 참조 (다형적 참조)
		System.out.println("Parent -> Child");
		Parent poly=new Child(); // child 인스턴스를 생성했기때문에 부모, 자식 객체 모두 생성됨 => 해당 객체를 부모타입에 담는것
								 // 부모타입은 자식타입을 담을수있기 때문
		poly.parentMathod();
//		poly.ChildMethod(); 결국은 부모 타입이기때문에 자식으로 바로 접근 불가
		
//		Child child=new Parent(); 컴파일 오류 => 자식은 부모를 담을 수 없음
	}

}
