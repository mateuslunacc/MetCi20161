import java.util.ArrayList;
import java.util.Random;

public class Main {
	//Test
	public static void main(String[] args) {
		Integer size = 20;
		Sorter s;
		ArrayList<Integer> a;
		Random r;
		
		a = new ArrayList<Integer>();
		r = new Random();
		
		for (int i = 0; i < size; i++) {
			a.add(r.nextInt(99));
		}

		s = new Sorter(a);
		
		for (int i = 0; i < size; i++) {
			System.out.println(s.getElement(i));
		}
		System.out.println();
		
		s.heapSort();
		
		for (int i = 0; i < size; i++) {
			System.out.println(s.getElement(i));
		}
		
	}

}
