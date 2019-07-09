package list_practice.park;

public class Park {
	private String renter;
	private int car_number;
	private Position pos;
	
// 생성자
	public Park() {
		this("N/A", 0, null);
	}
	
	public Park(String _renter, int _car_number, Position _pos) {
		this.renter = _renter;
		this.car_number = _car_number;
		this.pos = _pos;
	}
// 생성자

// renter
	public void set_renter(String _renter) {
		this.renter = _renter;
	}
	
	public String get_renter() {
		return this.renter;
	}
// renter	
	
// car_number
	public void set_car_number(int _car_number) {
		this.car_number = _car_number;
	}
	
	public int get_car_number() {
		return this.car_number;
	}
// car_number
	
// pos
	public void set_pos(Position _pos) {
		this.pos = _pos;
	}
	
	public Position get_pos() {
		return this.pos;
	}
// pos
	
	
	// 데이터 출력
	public void print_inform() {
		System.out.println("renter : " + this.renter);
		System.out.println("car_number : " + this.car_number);
		System.out.println("position : " + this.pos.return_position());
	}
}
