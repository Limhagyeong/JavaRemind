package static1;

public class Data2 {

	public String name;


	public Data2(String name, Counter counter) {
		// TODO Auto-generated constructor stub
		this.name=name;
		counter.count++;
	}
}
