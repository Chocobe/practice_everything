package vector_practice.vector_3;

import java.util.Iterator;
import java.util.Vector;

public class Vector_Tester {
	public static void main(String[] args) {
		Vector<Drink> DB = new Vector<Drink>();
		
		DB.add(new Drink("Pocari", 10));
		DB.add(new Drink("Coke", 5));
		
		Iterator<Drink> itr = DB.iterator();
		
		while(itr.hasNext()) {
			Drink temp = itr.next();
			temp.print_inform();
		}
		
		System.out.println("종료");
	}
}
