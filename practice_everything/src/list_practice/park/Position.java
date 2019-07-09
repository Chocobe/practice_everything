package list_practice.park;

public class Position {
	private int x;
	private int y;
	
// 생성자
	public Position() {
		this(0, 0);
	}
	
	public Position(int _x, int _y) {
		this.x = _x;
		this.y = _y;
	}
// 생성자
	
// x
	public void set_x(int _x) {
		this.x = _x;
	}
	
	public int get_x() {
		return this.x;
	}
// x
	
// y
	public void set_y(int _y) {
		this.y = _y;
	}
	
	public int get_y() {
		return this.y;
	}
// y
	
	// 위치값 반환
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	(String) (x, y)
	public String return_position() {
		return "(" + this.x + ", " + this.y + ")";
	}
}
