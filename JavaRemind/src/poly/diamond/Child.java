package poly.diamond;
// 인터페이스 구현은 다중 구현이 가능
public class Child implements InterfaceA, InterfaceB {

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("child.methodA");
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("child.methodB");
	}

	@Override
	public void methodCommon() {
		// TODO Auto-generated method stub
		System.out.println("child.commonMethod");
	}

}
