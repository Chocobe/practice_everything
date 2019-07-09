package vector_practice.vector_2;

public class User {
	private String name;
	private String id;
	private String password;
	
// 생성자
	public User() {
		this("초코비", "Chocobe", "chococo");
	}
	
	public User(String _name, String _id, String _password) {
		this.name = _name;
		this.id = _id;
		this.password = _password;
	}
// 생성자
	
// name - get/set
	public void set_name(String _name) {
		this.name = _name;
	}
	
	public String get_name() {
		return this.name;
	}
// name - get/set
	
	
// id - get/set
	public void set_id(String _id) {
		this.id = _id;
	}
	
	public String get_id() {
		return this.id;
	}
// id - get/set
	
	
// password - get/set
	public void set_password(String _password) {
		this.password = _password;
	}
	
	public String get_password() {
		return this.password;
	}
// password - get/set
	
	
	// 모든 정보 출력
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public void print_inform() {
		System.out.println("name : " + this.name);
		System.out.println("id : " + this.id);
		System.out.println("password : " + this.password);
	}
}
