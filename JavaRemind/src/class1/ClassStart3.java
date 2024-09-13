package class1;

public class ClassStart3 {
	public static void main(String[] args) {	
		Student[] students=new Student[2];
		
		Student student1; 
		
		student1 = new Student(); 
		student1.name="하경"; 
		student1.age=20;
		student1.grade=100;
		
		Student student2 = new Student();
		student2.name="하경2"; 
		student2.age=22;
		student2.grade=100;
		
		System.out.println(student1);
		System.out.println(student2);
		
		System.out.println(student1.name+" "+student1.age+" "+student1.grade);
		System.out.println(student2.name+" "+student2.age+" "+student2.grade);
		
		
	}
}
