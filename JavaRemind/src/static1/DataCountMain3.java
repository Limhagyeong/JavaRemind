package static1;
// static 영역(메서드 영역 안에 있음)에 생성된 하나의 변수를 공유한다는 것을 알 수 있음
public class DataCountMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data3 data1=new Data3("A");
		System.out.println("A count=" + Data3.count);
		
		Data3 data2=new Data3("B");
		System.out.println("B count=" + Data3.count);
		
		Data3 data3=new Data3("C");
		System.out.println("C count=" + Data3.count);
		
		// 인스턴스를 통한 접근 => 권장 X : 이렇게 쓰면 인스턴스 변수인지 클래스 변수인지 헷갈림
		Data3 data4=new Data3("D");
		System.out.println("D count=" + data4.count);
		
		// 클래스를 통한 접근 : 클래스 변수인것이 명확하게 보임
		System.out.println("D count=" + Data3.count);
	}
	

}
