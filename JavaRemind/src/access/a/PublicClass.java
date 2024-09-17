package access.a;
// class레벨에는 public, default만 사용 가능
// 하나의 자바 파일에는 public클래스는 하나만 등장 가능 / default는 무한정 
public class PublicClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicClass pc=new PublicClass();
		defaultClass1 dc1=new defaultClass1();
		defaultClass2 dc2=new defaultClass2();
	}

}

class defaultClass1{
	
}

class defaultClass2{
	
}