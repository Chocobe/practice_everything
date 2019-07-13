package practice_project;

public class Snack_tester {
	public static void main(String[] args) {
		// Snack 객체의 사용 메소드
		// 1. 생성자
		// 2. sold_one(Snack.AGE_CODE)
		// 3. print_sales_info()
		// 4. print_customer_age_state()
		
		Snack ice_chocobe = new Snack("아이스 초코비", 1000, 2000, 50);
		Snack chocobe = new Snack("초코비", 500, 1000, 20);
		
		ice_chocobe.integrated_sales_sequence(Snack.AGE_UNTIL_10, 4);
		
		System.out.println();
		
		chocobe.integrated_sales_sequence(Snack.AGE_UNTIL_30, 3);
	}
	
	

}
