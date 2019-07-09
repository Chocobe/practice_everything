package list_practice.book;

public class Book {
	private String title;
	private String author;
	private int price;
	
// 생성자
	public Book() {
		this("no-title", "no-author", 0);
	}
	
	public Book(String _title, String _author, int _price) {
		this.title = _title;
		this.author = _author;
		this.price = _price;
	}
// 생성자
	

// title
	public void set_title(String _title) {
		this.title = _title;
	}
	
	public String get_title() {
		return this.title;
	}
// title
	
// author
	public void set_author(String _author) {
		this.author = _author;
	}
	
	public String get_author() {
		return this.author;
	}
// author
	
// price
	public void set_price(int _price) {
		this.price = _price;
	}
	
	public int get_price() {
		return this.price;
	}
// price
	
	// 정보 출력
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public void print_inform() {
		System.out.println("title : " + this.title + "\nauthor : " + this.author + "\nprice : " + this.price);
	}
}
