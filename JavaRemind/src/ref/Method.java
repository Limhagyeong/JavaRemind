package ref;

public class Method {
	
	public static void main(String[] args) {
		Student student1=new Student();
		student1.name="하경";
		student1.age=25;
		student1.grade=90;
		printStudent(student1);
		
	}
	
	static void printStudent(Student student) {
		Student s=student;
		System.out.println("이름: "+ s.name+" 나이:"+s.age+" 성적:"+s.grade);
	}
}
