package ref;

public class VarChange2 {
	public static void main(String[] args) {
		// 참조형
		Data dataA=new Data();
		dataA.vaule=10;
		Data dataB=dataA; // 참조값이 복사됨 => A와 B는 같은 주소를 공유하고 있는 것
		
		System.out.println(dataA);
		System.out.println(dataB);
	}
}
