package construct;

public class MemberInit {
	String name;
	int age;
	int grade;
	
	void initMember(String nameIn, int ageIn, int grade){
		name=nameIn;
		age=ageIn;
		this.grade=grade; // 멤버변수와 변수명이 같을 땐 this로 구분
	}
}
