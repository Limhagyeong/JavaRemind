package poly.ex6;

public class SoundFlyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		Bird bird=new Bird();
		Chicken chicken=new Chicken();
		
		sounAnimal(dog);
		sounAnimal(bird);
		sounAnimal(chicken);
		
		flyAnimal(bird);
		flyAnimal(chicken);

	}
	
	// AbstractAnimal 사용 가능
	public static void sounAnimal(AbstractAnimal animal) {
		animal.sound();
	}
	
	public static void flyAnimal(Fly animal) {
		animal.fly();		
	}


}
