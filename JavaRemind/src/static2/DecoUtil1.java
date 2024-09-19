package static2;
// 인스턴스가 필요한 이유는 멤버변수 등을 사용할 목적이 가장 큼
// 현재 deco메서드는 단순히 기능만을 제공함
// 인스턴스로 생성할 이유가 없음
public class DecoUtil1 {
	
	public String deco(String str) {
		
		return "* "+str+" *";
		
	}
	
}
