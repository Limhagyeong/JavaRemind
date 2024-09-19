package static2;
// static은 static에만 접근 가능
public class DecoData {
	
	private int instanceValue;
	private static int staticValue;
	
	public static void staticCall() {
		
		staticValue++; // 정적 변수에 접근가능
		DecoData.staticMethod(); // 정적 클래스 접근 가능 => DecoData. 을 생략 가능한 것임
//		instanceMethod(); => 컴파일 오류 (인스턴스 메서드에 접근 불가)
		// static은 클래스에 가서 변수나 메서드에 접근함 => 인스턴스로 접근할 참조변수가 없으므로 접근 불가
	}

	private void instanceMethod() {
		System.out.println("instanceValue="+instanceValue);
		System.out.println("staticValue="+staticValue);
	}
	
	private static void staticMethod() {
//		System.out.println("instanceValue="+instanceValue); => 컴파일 오류 (static 메서드는 인스턴스 변수에 접근할 수 없음)
		System.out.println("staticValue="+staticValue);
	}
	
	public void instanceCall() {
		
		staticValue++; // 정적 변수에 접근가능 
		// 정적 클래스 접근 가능
		
		instanceValue++;
		instanceMethod();
	}
	
	public static void staticCall (DecoData data) {
		// 가능한 이유는 data 매개변수는 외부네서 참조값이 넘어오기 때문
		data.instanceValue++;
		data.instanceMethod();
	}
}
