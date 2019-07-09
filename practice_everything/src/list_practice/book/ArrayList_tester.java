package list_practice.book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList_tester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Book> DB = new ArrayList<Book>();
		
		String title = "";
		String author = "";
		int price = 0;
		
		boolean is_continue = true;
		
		while(is_continue) {
			System.out.print("title : ");
			title = scanner.nextLine();
			
			System.out.print("author : ");
			author = scanner.nextLine();
			
			while(true) {
				System.out.print("price : ");
				try {
					price = scanner.nextInt();
					scanner.nextLine();
					break;
					
				} catch(Exception e) {
					System.out.println("입력한 가격은 유효하지 않습니다.");
					scanner.nextLine();
				}
			}
			
			DB.add(new Book(title, author, price));
			
			while(true) {
				System.out.print("입력을 계속 하시겠습니까?(y/n) : ");
				String continue_answer = scanner.nextLine();
				
				if(continue_answer.equals("y")) {
					is_continue = true;
					break;
					
				} else if(continue_answer.equals("n")) {
					is_continue = false;
					break;
				}
				
				System.out.println("다시 입력해 주세요");
			}// while(true)			
		}// while(is_continue)
		
		System.out.println("--- 저장된 정보를 출력합니다 ---");
		
		Iterator<Book> itr = DB.iterator();
		while(itr.hasNext()) {
			Book temp = itr.next();
			temp.print_inform();
			
			System.out.println("----------------------------");
		}
		
		System.out.println("프로그램을 종료합니다");
		scanner.close();
	}
}
