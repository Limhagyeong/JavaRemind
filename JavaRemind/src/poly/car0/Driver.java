package poly.car0;

public class Driver {
	
	private K3Car k3Car;
	private Model3Car model3;
	
	public void setK3Car(K3Car k3Car) {
		this.k3Car=k3Car;
	}
	
	public void setmodel3(Model3Car model3) {
		this.model3=model3;
	}

	public void drive() {
		System.out.println("자동차 운전");
		
		if(k3Car!=null) {
			k3Car.stertEngine();
			k3Car.pressAccelerator();
			k3Car.offEngine();
		}
		else if(model3!=null) {
			model3.stertEngine();
			model3.pressAccelerator();
			model3.offEngine();
		}
		
	}
}
