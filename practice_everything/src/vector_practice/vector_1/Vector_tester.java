package vector_practice.vector_1;

import java.util.Iterator;
import java.util.Vector;

public class Vector_tester {
	public static void main(String[] args) {
		Vector<Point> vector = new Vector<Point>();
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				vector.add(new Point(i, j));
			}
		}

		for(int i = 0; i < vector.size(); i++) {
			Point temp = vector.elementAt(i);
			System.out.println("(" + temp.get_x() + ", " + temp.get_y() + ")");			
		}
		
		for(int i = 0; i < 3; i++) {
			vector.add(3 + i, new Point(3, i));
		}
		
		Iterator<Point> iter = vector.iterator();
		while(iter.hasNext()) {
			Point temp = iter.next();
			System.out.println("(" + temp.get_x() + ", " + temp.get_y() + ")");
		}
	}
}
