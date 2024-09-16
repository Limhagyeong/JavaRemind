package construct;

public class ConstructMain1 {
	public static void main(String[] args) {
		// 생성자를 사용하지 않으면 메소드를 호출해서 값을 넣어줘야되는데 이는 번거로움 + 호출 누락 실수가 있어도 컴파일 오류가 나지 않기때문에 오류를 잡기 어려워짐
		// 객체를 생성함과 동시에 생성자를 호출하여 번거로움과 누락을 방지함 => 필수 입력값을 보장할 수 있음
		MemberConstruct member1=new MemberConstruct("user1", 20, 90);
		MemberConstruct member2=new MemberConstruct("user2", 20, 90);
		
		MemberConstruct[] members= {member1,member2};
		
		for(MemberConstruct member : members) {
			System.out.println("이름:"+member.name+"나이:"+member.age+"성적:"+member.grade);
		}
	}
}
