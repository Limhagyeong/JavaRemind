package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
	public void call() {
		publicValue=1;
		protectedValue=2; // 상속관계 혹은 같은 패키지에서 호출 가능 (protected)
//		defaulValue=3; 다른 패키지에는 접근 불가 (default) => 컴파일 오류
//		privateValue=4; 컴파일 오류
		
		publicMethod();
		protectedMethod();
//		defaultMethod();
//		privateMethod();
		
		printParent(); 
	}
}
