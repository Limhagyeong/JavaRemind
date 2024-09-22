package poly.basic;

public class CastingMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 부모 변수가 자식 인스턴스 참조 (다형적 참조)
				Parent poly=new Child(); // x001
				// 단 자식의 기능은 바로 호출할 수 없다 컴파일 오류
//				poly.ChildMathod() 컴파일 오류
				
				// 다운캐스팅을 통해 해결
				// 부모타입의 객체 참조값을 복사
				// 복사된 참조값을 강제로 변환
				// 즉 poly의 타입은 Parent로 유지되고 복사한 참조값만 Child로 지정되는 것
				Child child=(Child)poly; // 부모 타입의 객체를 강제로 자식타입으로 변환
				
				child.ChildMethod(); 
	}

}
