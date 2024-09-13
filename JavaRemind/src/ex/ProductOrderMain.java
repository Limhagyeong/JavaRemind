package ex;

import java.util.*;

public class ProductOrderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("주문할 주문의 개수를 입력하세요: ");
		int totalOrders=scanner.nextInt();
		
		ProductOrder[] eachOrders=createOrders(scanner, totalOrders);
		

	}

	static ProductOrder[] createOrders(Scanner scanner, int totalOrders) {
		ProductOrder[] p = new ProductOrder[totalOrders];

		for (int i = 1; i <= p.length; i++) {

			System.out.println(i + "번째 주문 정보를 입력하세요");
			
			System.out.print("상품명:");
			String name = scanner.next();
			p[i].productName = name;

			System.out.print("가격:");
			int price = scanner.nextInt();
			p[i].price = price;

			System.out.print("수량:");
			int quantity = scanner.nextInt();
			p[i].quantity = quantity;
			System.out.println();
		}
		
		return p;
	}
	
//	static void printOrders(ProductOrder[] p) {
//		for(ProductOrder eachOrder : p) {
//			System.out.println("상품명: "+eachOrder.productName+
//								"가격: "+eachOrder.price+
//								" 갯수: "+eachOrder.quantity);
//		}
//	}
//	
//	static int getTotalAmount(ProductOrder[] p) {
//		int Amount=0;
//		
//		for(ProductOrder eachOrder : p) {
//			Amount += eachOrder.quantity * eachOrder.price;
//		}
//
//		return Amount;
//	}
	
	

}
