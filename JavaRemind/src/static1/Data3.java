package static1;

public class Data3 {

	public String name; // 멤버변수 인스턴스 변수 (static x)
	public static int count; // 멤버변수 클래스 변수 (static o)

	public Data3(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
		count++;
	}
}
