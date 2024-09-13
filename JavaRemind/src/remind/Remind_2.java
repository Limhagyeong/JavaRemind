package remind;

public class Remind_2 {
	
	public static void main(String[] args) {
		String[] name= {"학생1", "학생2"};
		int[] age=  {20,24} ;
		int[] grade = {70,90};
		
		for(int i=0;i<name.length;i++) {
			System.out.println("이름:"+name[i]+" 나이:"+age[i]+" 성적:"+grade[i]);
		}
		
	}
}
