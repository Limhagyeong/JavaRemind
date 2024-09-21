package extends1.super2;

public class ClassC extends ClassB{
	

	public ClassC(){
//		super(); 기본 생성자는 생성자가 하나도 없는 경우 자동 호출됨 => B에 정의한 생성자가 있으므로 기본 생성자는 자동 호출 불가
		
		// 부모 생성자를 반드시 호출해야하기때문에 직접 정의해줘야함
		super(10, 20); 
		System.out.println("ClassC 생성자");
	}
}
