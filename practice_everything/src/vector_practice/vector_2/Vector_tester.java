package vector_practice.vector_2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Vector_tester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Vector<User> DB = new Vector<User>();
		
		String name = "";
		String id = "";
		String password = "";
		String continue_answer = "y";
		
		while(continue_answer.equals("y")) {
			System.out.print("이름을 입력하세요 : ");
			name = scanner.nextLine();
			
			System.out.print("아이디를 입력하세요 : ");
			id = scanner.nextLine();
			
			System.out.print("패스워드를 입력하세요 : ");
			password = scanner.nextLine();
			
			DB.add(new User(name, id, password));
			
			while(true) {
				System.out.print("새 입력(y) / 입력 종료(n) : ");
				continue_answer = scanner.nextLine();
				
				if(continue_answer.equals("y")) {
					continue_answer = "y";
					break;
					
				} else if(continue_answer.equals("n")) {
					continue_answer = "n";
					break;	
				}
			}
		}
		
		Iterator<User> itr = DB.iterator();
		System.out.println("------------------------------------");
		
		while(itr.hasNext()) {
			User temp = itr.next();
			temp.print_inform();
			System.out.println("------------------------------------");
		}
		
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}
}
