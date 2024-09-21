package final1;

public class FinalFieldMain {
public static void main(String[] args) {
	// final 필드 - 생성자 초기화
	System.out.println("생성자 초기화");
	ConstructInit constructInit1=new ConstructInit(10);
	ConstructInit constructInit2=new ConstructInit(20);
	
	System.out.println(constructInit1.value);
	System.out.println(constructInit2.value);
	
	// final 필드 - 필드 초기화
	System.out.println("필드 초기화");
	FieldInit fieldInit1=new FieldInit();
	FieldInit fieldInit2=new FieldInit(); // final 필드변수가 필요할 떄마다 인스턴스를 생성해서 불러와야함 => 항상 같은 값을 가짐에도!
	FieldInit fieldInit3=new FieldInit();

	System.out.println(fieldInit1.value);
	System.out.println(fieldInit2.value);
	System.out.println(fieldInit3.value);
	
	// 상수 접근
	System.out.println("상수");
	System.out.println(fieldInit1.CONST_VALUE); // 위와 같은 메모리 낭비를 방지하기 위해 static으로 선언해주는것
}
}
