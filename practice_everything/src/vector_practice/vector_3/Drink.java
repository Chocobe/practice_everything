package vector_practice.vector_3;

public class Drink {
	private String name;
	private int remain_num;
	
// 생성자
	public Drink() {
		this("우롱차", 0);
	}
	
	public Drink(String _name, int _remain_num) {
		this.name = _name;
		this.remain_num = _remain_num;
	}
// 생성자
	
	
// name
	public void set_name(String _name) {
		this.name = _name;
	}
	
	public String get_name() {
		return this.name;
	}
// name
	
	
// remain_num
	public void set_remain_num(int _remain_num) {
		this.remain_num = _remain_num;
	}
	
	public int get_remain_num() {
		return this.remain_num;
	}
// remain_num
	
	
	// 현재 정보 출력
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public void print_inform() {
		System.out.printf("name :%7s, remain_num : %3d개\n", this.name, this.remain_num);
	}
}
