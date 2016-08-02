import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	QuickSort s;
	HeapSort h;
	ArrayList<Integer> a;
	Scanner sc;

	private static void output(ArrayList<Integer> e) {
		for (int i = 0; i < e.size(); i++) {
			System.out.println(e.get(i));
		}
	}
	
	public static void main(String[] args) throws IOException {
		QuickSort qs;
		HeapSort hs;
		ArrayList<Integer> a;
		Scanner sc;
		
		a = new ArrayList<Integer>();		
		sc = new Scanner(System.in);
		
		while (sc.hasNextInt()) {
			Integer num = (Integer) sc.nextInt();
			a.add(num);
		}
		
		sc.close();
		
		if (args[0].toUpperCase().equals("QUICKSORT")) {
			qs = new QuickSort(a);
			qs.sort(0, qs.size() - 1);
			output(qs.getElements());
		} else {
			hs = new HeapSort(a);
			hs.sort();
			output(hs.getElements());
		}
		
	}

}
