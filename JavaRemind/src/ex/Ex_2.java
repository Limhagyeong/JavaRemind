package ex;
// 학생 별 데이터 관리가 어려움 => class로 극복
public class Ex_2 {
	
	public static void main(String[] args) {
		String[] name= {"학생1", "학생2"};
		int[] age=  {20,24} ;
		int[] grade = {70,90};
		
		for(int i=0;i<name.length;i++) {
			System.out.println("이름:"+name[i]+" 나이:"+age[i]+" 성적:"+grade[i]);
		}
		
	}
}
