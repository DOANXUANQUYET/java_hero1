package kadai0306;

import java.util.Scanner;

public class kadai0306 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Order order = new Order();
		
		System.out.println("CustomerNo -->");
		String customerNo = scanner.next();
		System.out.println("CustomerName -->");
		String customerName = scanner.next();
		
		order.setCustomerNo(customerNo);
		order.setCustomerName(customerName);
		System.out.println();
		
		System.out.println("Code(-1:end) -->");
		int code = scanner.nextInt();
		
		while(code != -1) {
			if((order.getPrice(code) != -1) && (order.getNum(code) != -1)) {
				System.out.println("Price : " + order.getPrice(code) + " Num : " + order.getNum(code));
				System.out.println("Num --> ");
				int num = scanner.nextInt();
				order.addNum(code, num);
			}else {
				System.out.println("Code Error!");
			}
			System.out.println();
			System.out.println("Code(-1:end) -->");
			code = scanner.nextInt();
		}
		
		System.out.println("CustomerNo : " + order.getCustomerNo());
		System.out.println("CustomerName : " + order.getCustomerName());
		System.out.println("Total Price : " + order.getTotal());
				
	}

}
