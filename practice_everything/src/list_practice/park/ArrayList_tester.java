package list_practice.park;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList_tester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Park> park_db = new ArrayList<Park>();
		
		boolean is_continue = true;
		Park park = null;
		String renter = "";
		int car_number = 0;
		Position pos = null;
		int x = 0;
		int y = 0;
		
		String continue_answer = "";
		
		while(is_continue) {
			System.out.print("임차인 입력 : ");
			renter = scanner.nextLine();
			
			while(true) {
				try {
					System.out.print("차 번호 입력 : ");
					car_number = scanner.nextInt();
					break;
				
				} catch(Exception e) {
					System.out.println("잘못된 번호입니다.");
					scanner.nextLine();
					continue;
				}
			}// while(true)
			
			while(true) {
				try {
					System.out.print("위치값 x : ");
					x = scanner.nextInt();
					
					System.out.print("위치값 y : ");
					y = scanner.nextInt();
					
					pos = new Position(x, y);
					
				} catch(Exception e) {
					System.out.println("잘못된 위치값입니다.");
					scanner.nextLine();
					continue;
					
				}
				
				scanner.nextLine();
				break;
				
			}// while(true)
			
			park = new Park(renter, car_number, pos);
			park_db.add(park);
			
			while(true) {
				System.out.print("계속 입력하시겠습니까?(y/n) : ");
				continue_answer = scanner.nextLine();
				
				if(continue_answer.equals("y")) {
					is_continue = true;
					break;
					
				} else if(continue_answer.equals("n")) {
					is_continue = false;
					break;
					
				} else {
					System.out.println("잘못된 입력입니다");
					continue;
				}
			}// while(true)
		}// while(is_continue)
		
		System.out.println("\n--- 모든 데이터 출력 ---");
		
		Iterator<Park> itr = park_db.iterator();
		while(itr.hasNext()) {
			itr.next().print_inform();
			System.out.println("---------------------------");
		}// while(itr.hasNext())
		
		System.out.println("프로그램을 종료합니다");
		scanner.close();
	}
}
