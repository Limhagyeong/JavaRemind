package class1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class test {
	
	public static void printing(Map<String, ?> map) {
		for(Entry<String, ?> entry : map.entrySet()){
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Object> map=new HashMap<>();
		
		for(int i=0;i<=2;i++) {
			Scanner scanner=new Scanner(System.in);
			System.out.print("나이를 입력하세요");
			int age=scanner.nextInt();
			System.out.print("성적을 입력하세요");
			int grade=scanner.nextInt();
			System.out.print("이름을 입력하세요");
			String name=scanner.next();
			
			map.put("age", age);
			map.put("grade", grade);
			map.put("name", name);
		}
		
		printing(map);
	}

}
