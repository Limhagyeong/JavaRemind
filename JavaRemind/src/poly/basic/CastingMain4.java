package poly.basic;
// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

	public static void main(String[] args) {
		Parent parent1=new Child(); // 부모 타입의 자식 객체
		Child child1=(Child)parent1;
		child1.ChildMethod(); // 문제 없음
		
		Parent parent2=new Parent();
		Child child2=(Child)parent2; // 부모 타입의 부모 객체이기때문에 다운캐스팅 불가 => 런타임오류
		child2.ChildMethod();
	}
}
