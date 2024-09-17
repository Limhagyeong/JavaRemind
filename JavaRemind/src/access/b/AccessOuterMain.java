package access.b;

import access.a.AccessData;

public class AccessOuterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessData data=new AccessData();
		
		// public
		data.publicField=1;
		data.publicMethod();
		
		// 다른 패키지 default => 컴파일 오류
//		data.defaultField=2;
//		data.defautMethod();
		
		// private => 컴파일 오류
		// data.privateField=3;
		
		data.innerAccess();

	}

}
