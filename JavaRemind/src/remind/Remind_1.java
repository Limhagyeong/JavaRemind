package remind;

import java.util.*;
import java.util.Map.Entry;


public class Remind_1 {
   
   public static void printing(List<Map<String, Object>> list) {
       for (Map<String, Object> entity : list) {
               for (Map.Entry<String, Object> entry : entity.entrySet()) {
                   System.out.println(entry.getKey() + ": " + entry.getValue());
               }
               System.out.println();
           }
   }

   public static void main(String[] args) {
      // TODO Auto-generated method stub      
      Scanner scanner=new Scanner(System.in);
      
      List list=new ArrayList();
      
      for(int i=0;i<=2;i++) {
         System.out.print("나이를 입력하세요");
         int age=scanner.nextInt();
         System.out.print("성적을 입력하세요");
         int grade=scanner.nextInt();
         System.out.print("이름을 입력하세요");
         String name=scanner.next();
         
         Map<String,Object> map=new HashMap<>();
         
         map.put("age", age);
         map.put("grade", grade);
         map.put("name", name);
         
         list.add(map);
         
      }
      
      printing(list);
   }

}
