package final1;

public class FinalLocalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파이널 지역 변수
		final int data1;
		data1=10; // 최초 한번만 할당 가능
//		data2=20; => 컴파일 오류
		
		//final 지역 변수2
		final int data2=10;
//		data2=10; => 컴파일 오류
		method(data2);

	}
	
	static void method(final int parameter) {
//		parameter =20; => 중간에 변경 불가
	}

}
