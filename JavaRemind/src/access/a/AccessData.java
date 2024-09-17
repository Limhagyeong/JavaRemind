package access.a;

public class AccessData {
	
	public int  publicField;
	int defaultField;
	private int privateField;
	
	public void publicMethod() {
		System.out.println("publicMethod 호출 "+publicField);
	}
	
	void defautMethod() {
		System.out.println("defautcMethod 호출 "+defaultField);
	}
	
	private void privateMethod() {
		System.out.println("privateMethod 호출 "+privateField);
	}
	
	public void innerAccess() {
		System.out.println("내부호출"); // 내부에서는 모든 접근제어자에 접근 가능
		publicField=100;
		defaultField=200;
		privateField=300;
		publicMethod();
		defautMethod();
		privateMethod();
	}
}
