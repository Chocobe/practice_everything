package practice_project;

public class Snack {
	public static final int AGE_UNTIL_10 = 0;
	public static final int AGE_UNTIL_20 = 1;
	public static final int AGE_UNTIL_30 = 2;
	public static final int AGE_UNTIL_40 = 3;
	public static final int AGE_UNTIL_50 = 4;
	public static final int AGE_UNTIL_60 = 5;
	public static final int AGE_OTHERS = 6;
	
	private String name;
	
	private int remain_stock_num;
	private int sold_num;
	
	private int origin_price;
	private int sales_price;
	
	private int earning;
	
	private int[] customer_age;
	
	
// 생성자
	public Snack() {
		this("N/A", 0, 0, 0);
	}
	
	public Snack(
			String _name, int _origin_price, int _sales_price, int _stock_num) {
		this.name = _name;
		this.origin_price = _origin_price;
		this.sales_price = _sales_price;
		this.remain_stock_num = _stock_num;
		
		this.customer_age = new int[AGE_OTHERS + 1];
	}
// 생성자
	
	
// 상품명
	public String get_name() {
		return this.name;
	}
	
	public void set_name(String _name) {
		this.name = _name;
	}
// 상품명
	

// 재고량
	public int get_remain_stock_num() {n
		return this.remain_stock_num;
	}
	
	public void set_remain_stock_num(int _stock_num) {
		this.remain_stock_num = _stock_num;
	}
	
	public void sub_remain_stock_num() {
		this.remain_stock_num--;
	}
// 재고량
		
		
// 판매수
	public void add_sold_num() {
		this.sold_num++;
	}
	
	public int get_sold_num() {
		return this.sold_num;
	}
// 판매수
	
	
// 원가
	public int get_origin_price() {
		return this.origin_price;
	}
	
	public void set_origin_price(int _origin_price) {
		this.origin_price = _origin_price;
	}
// 원가
	
	
// 판매가
	public int get_sales_price() {
		return this.sales_price;
	}
	
	public void set_sales_price(int _sales_price) {
		this.sales_price = _sales_price;
	}
// 판매가
	
	
// 수익
	public void calc_earning() {
		this.earning += this.get_sales_price() - this.get_origin_price();
	}
	
	public int get_earning() {
		return this.earning;
	}
// 수익
	
	
// 구매자 연령
	public void sold_by_age(int _AGE_CODE) {
		this.customer_age[_AGE_CODE]++;
	}
	
	public int get_age_state(int _AGE_CODE) {
		return this.customer_age[_AGE_CODE];
	}
// 구매자 연령
	
	
// 판매 로직
	public void sold_one(int _AGE_CODE) {
		this.sub_remain_stock_num();
		this.add_sold_num();
		this.sold_by_age(_AGE_CODE);
		this.calc_earning();
	}
	
	public void integrated_sales_sequence(int _AGE_CODE, int _amount) {
		System.out.println(this.get_name() + "이(가) " + _amount + "개 팔렸습니다.");
		
		for(int i = 0; i < _amount; i++) {
			this.sold_one(_AGE_CODE);
		}	
		
		this.print_sales_info();
		this.print_customer_age_state();
	}
// 판매 로직
	
	
// 출력부
	public void print_sales_info() {
		System.out.println("----------------------------");
		System.out.println("[상품 정보]");
		System.out.println("- 상품명 : " + this.get_name());
		System.out.println("- 원가 : " + this.get_origin_price());
		System.out.println("- 판매가 : " + this.get_sales_price());
		System.out.println("- 재고량 : " + this.get_remain_stock_num());
		System.out.println("- 판매량 : " + this.get_sold_num());
		System.out.println("- 수익 : " + this.get_earning() + "\n");
	}
	
	public void print_customer_age_state() {
		System.out.println("[구매 연령 통계]");
		System.out.println("- 1 ~ 10세 미만 구매자 : " + this.get_age_state(Snack.AGE_UNTIL_10));
		System.out.println("- 10 ~ 20세 미만 구매자 : " + this.get_age_state(Snack.AGE_UNTIL_20));
		System.out.println("- 20 ~ 30세 미만 구매자 : " + this.get_age_state(Snack.AGE_UNTIL_30));
		System.out.println("- 30 ~ 40세 미만 구매자 : " + this.get_age_state(Snack.AGE_UNTIL_40));
		System.out.println("- 40 ~ 50세 미만 구매자 : " + this.get_age_state(Snack.AGE_UNTIL_50));
		System.out.println("- 50 ~ 60세 미만 구매자 : " + this.get_age_state(Snack.AGE_UNTIL_60));
		System.out.println("- etc : " + this.get_age_state(Snack.AGE_OTHERS));
		System.out.println("----------------------------");
	}
// 출력부
}








































