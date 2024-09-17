package access.a;

public class AccessInerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessData data=new AccessData();
		
		// public
		data.publicField=1;
		data.publicMethod();
		
		// 같은 패키지 default
		data.defaultField=2;
		data.defautMethod();
		
		// private
		// data.privateField=3; => 컴파일 오류
		
		data.innerAccess();
	}

}
