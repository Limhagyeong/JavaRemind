package access.b;

import access.a.PublicClass;

public class PublicClassOutterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PublicClass pc=new PublicClass();
		
		// 다른 패키지 내 default 접근 불가능 => 컴파일 오류
//		defaultClass1 dc=new defaultClass1();
//		defaultClass2 dc2=new defaultClass2();
		
	}

}
