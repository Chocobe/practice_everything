package vector_practice.vector_1;

public class Point {
	private int x;
	private int y;
	
// 생성자
	public Point() {
		this(0, 0);
	}
	
	public Point(int _x, int _y) {
		this.x = _x;
		this.y = _y;
	}
// 생성자	
	
	
	public int get_x() {
		return this.x;
	}
	
	public int get_y() {
		return this.y;
	}
	
}
