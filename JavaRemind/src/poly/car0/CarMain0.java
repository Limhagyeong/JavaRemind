package poly.car0;
// 추상 클래스로 선언할 수 있음 => 다만 인스턴스를 만들 수 없는 것뿐
public class CarMain0 {
	public static void main(String[] args) {
		Driver d=new Driver();
		K3Car k = new K3Car();
		Model3Car m=new Model3Car();
		d.setK3Car(k);
		d.drive();
		
		d.setK3Car(null);
		
		d.setmodel3(m);
		d.drive();
	}
}
