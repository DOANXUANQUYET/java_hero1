package kadai0306;

public class Order {
	
	private String customerNo;
	private String customerName;
	private int[] code = {8,6,3,5,2};
	private int[] price = {500,230,460,120,600};
	private int[] num = {0,0,0,0,0};
	
	public String getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public int getPrice(int cd) {
		
		for(int i = 0; i < code.length; i++) {
			if(code[i] == cd) {
				return price[i];
			}
		}
		return -1;
	}
	
	public int getNum(int cd) {
		for(int i = 0; i < code.length; i++) {
			if(code[i] == cd) {
				return num[i];
			}
		}
		return -1;
	}
	
	public void addNum(int cd, int nu) {
		for(int i = 0; i < code.length; i++) {
			if(code[i] == cd) {
				num[i] += nu;
			}
		}
	}
	
	public int getTotal() {
		int total = 0;
		for(int i = 0; i < code.length; i ++) {
			total += num[i] * price[i];
		}
		return total;
	}
	

}
