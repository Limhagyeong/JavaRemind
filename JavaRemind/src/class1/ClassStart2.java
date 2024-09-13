package class1;

public class ClassStart2 {
	
	public static void main(String[] args) {
		Student student1; // Student1이라는 참조변수가 스택영역에 올라가게됨 => 현재는 null값
		
		student1 = new Student(); // 힙영역에 student1이 참조할 수 있는 값의 공간(주소)이 생김 
								  // 즉 스택영역에 있는 student1은 힙 영역의 주소를 참조하게 됨 => 더이상 null이 아니다
		
//		new Student(); // 참조변수 없이 사용하면 힙 영역에 주소는 생기지만 이에 접근 할 매개체인 잠조변수가 없어 바로 GC대상이 되어버림
		
		student1.name="하경"; // .name => name 주소로 접근하여 값을 저장함 
		student1.age=20;
		student1.grade=100;
		
		Student student2 = new Student();
		student2.name="하경2"; 
		student2.age=22;
		student2.grade=100;
		
		System.out.println(student1.name+" "+student1.age+" "+student1.grade);
		System.out.println(student2.name+" "+student2.age+" "+student2.grade);
		
		
	}

}
