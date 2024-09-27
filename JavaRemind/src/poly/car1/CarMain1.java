package poly.car1;


public class CarMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 차량 선택지
		K3Car k=new K3Car();
		Mpdel3Car m=new Mpdel3Car();
		NewCar n=new NewCar();
		
		Driver d=new Driver();
		
		d.setCar(k);
		d.drive();

		d.setCar(m);
		d.drive();
	
		d.setCar(n);
		d.drive();
	}

}
