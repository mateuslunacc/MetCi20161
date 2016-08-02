import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	QuickSort s;
	HeapSort h;
	ArrayList<Integer> a;
	Scanner sc;

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
		
		if (args[0] == "quicksort") {
			qs = new QuickSort(a);
			qs.sort(0, qs.size() - 1);
			for (int i = 0; i < qs.size(); i++) {
				System.out.println(qs.getElement(i));
			}
		} else {
			hs = new HeapSort();
			hs.sort();
			for (int i = 0; i < hs.size(); i++) {
				System.out.println(hs.getElement(i));
			}
		}
		
		
		
	}

}
