package construct;

public class MemberConstruct {
	
	String name;
	int age;
	int grade;
	
	// 생성자 추가 (생성자 오버로딩)
	
	MemberConstruct(String name, int age ) {
		// TODO Auto-generated constructor stub

//		this.name=name;
//		this.age=age;
//		this.grade=55;
		
		this(name, age, 50); // 생성자 내부에서 자기 자신의 생성자 호출
	}
	
	MemberConstruct(String name, int age, int grade){
		System.out.println("생성자 호출 name="+name+" 생성자 호출 age="+age+" 생성자 호출 grade="+grade);
		
		this.name=name;
		this.age=age;
		this.grade=grade;
	}

}
