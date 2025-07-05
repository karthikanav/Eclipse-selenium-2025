package week2.day1;

public class RestaurantTwo {

	public static void main(String[] args) {
		Restaurant outingDay=new Restaurant();
		int billpayment=outingDay.billpayment(25);
		System.out.println(billpayment);
		String orderFood=outingDay.orderFood("Masala Dosa");
		System.out.println(orderFood);
		boolean orderMore= outingDay.orderMore();
		System.out.println(orderMore);
		outingDay.windowShopping();
		
		
		// TODO Auto-generated method stub

	}

}
