package access.a;

public class PublicClassInnerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PublicClass pc=new PublicClass();
		
		// 같은 패키지 내 default 접근 가능
		defaultClass1 dc=new defaultClass1();
		defaultClass2 dc2=new defaultClass2();
		
	}

}
