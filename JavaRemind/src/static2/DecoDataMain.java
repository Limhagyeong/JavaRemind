package static2;

import static static2.DecoData.staticCall;
public class DecoDataMain {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. 정적 호출");
		DecoData.staticCall(); // 인스턴스로 접근 안하고 직접 클래스로 접근!
		
		// import 래주면 클래스명. 하지 않고 바로 접근 가능
		staticCall(); 
		
		System.out.println("2. 인스턴스 호출 1");
		DecoData data=new DecoData();
		data.instanceCall();
		
		System.out.println("2. 인스턴스 호출 2");
		DecoData data2=new DecoData();
		data2.instanceCall();
		
		DecoData.staticCall(data2);
		
		
		// 인스턴스를 통한 접근 => 권장하지않음 => 인스턴스영역에서 메서드 영역으로 돌려버리는 불필요한 과정이 일어남 
		// + 인스턴스 메서드인지 static 메서드인지 혼동
		DecoData data3=new DecoData();
		System.out.println("인스턴스 통한 접근");
		data3.staticCall();
		
		// 클래스를 통한 접근
		System.out.println("클래스 통한 접근");
		DecoData.staticCall();
	}

}
