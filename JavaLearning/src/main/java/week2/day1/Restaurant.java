package week2.day1;

public class Restaurant {
	
	public void windowShopping() {
		System.out.println("Scan the products");
		
	}
	
	public String orderFood(String Dosa) {
		
		return Dosa;
	}
	
	public boolean orderMore() {
		return false;
	}
	
	public int billpayment(int billPayment) {
		
		return billPayment;
	}

	public static void main(String[] args) {
		
		Restaurant outingDay=new Restaurant();
		System.out.println(outingDay.orderFood("Masala Dosa"));
		System.out.println(outingDay.orderFood("Tasty Dosa"));
		int foo = outingDay.billpayment(25);
		System.out.println(foo);
		// TODO Auto-generated method stub

	}

}
