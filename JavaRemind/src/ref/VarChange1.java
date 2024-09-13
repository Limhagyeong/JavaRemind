package ref;

public class VarChange1 {
	public static void main(String[] args) {
		int a=10;
		int b=a; // 값만 복사함 => a와 b는 다른 공간을 가지고있는것
		
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		a=20;
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		b=30;
		System.out.println(a);
		System.out.println(b);
	}

}
