package poly.diamond;

public class DiamonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceA a=new Child();
		a.methodA();
		a.methodCommon();
		
		InterfaceB b=new Child();
		b.methodB();
		b.methodCommon();
	}

}
