package ref;

public class Method1 {
	
	public static void main(String[] args) {
		Student student1=new Student();
		
		createStudent("하경", 25, 90);
		
		Student student2=new Student();
		
		createStudent("하경1", 26, 80);
		
		printStudent(student1);
		printStudent(student2);
	}
	
	static Student createStudent(String name, int age, int grade) {
		
		Student s=new Student();
		
		s.name=name;
		s.age=age;
		s.grade=grade;
		
		return s;
	} // 객체 생성 메소드
	
	static void printStudent(Student s) {
		System.out.println("이름: "+ s.name+" 나이:"+s.age+" 성적:"+s.grade);
	} // 값을 출력하는 메소드
}
