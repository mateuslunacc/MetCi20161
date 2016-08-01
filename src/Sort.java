import java.util.ArrayList;

public class Sort {

	private ArrayList<Integer> elements;
	
	public Sort() {
		this.elements = new ArrayList<>();
	}
	
	public Sort(ArrayList<Integer> data) {
		this.elements = data;
	}
	
	public ArrayList<Integer> getElements() {
		return this.elements;
	}

	public Integer getElement(Integer index) {
		return this.elements.get(index);
	}

	public void setElement(Integer index, Integer element) {
		this.elements.set(index, element);
	}

	public void removeElement(Integer index) {
		this.elements.remove(index);
	}

	public void clearElements() {
		this.elements.clear();
	}
	
	protected void swap(Integer index1, Integer index2) {
	    Integer temp = elements.get(index1);
	    elements.set(index1, elements.get(index2));
	    elements.set(index2, temp);
	}
	
	private Integer pivot(Integer first, Integer last) {
		Integer p = first;
		Integer pivotElement = elements.get(first);
	 
	    for(Integer i = first+1 ; i <= last ; i++) {
	        if(elements.get(i) <= pivotElement) {
				this.swap(i, ++p);
			}
	    }
		
		this.swap(p, first);
	    
	    return p;
	}
	
	public void quickSort(Integer first, Integer last ) {
		Integer pivotElement;
	 
	    if(first < last) {
	        pivotElement = this.pivot(first, last);
	        
	        quickSort(first, pivotElement-1);
	        quickSort(pivotElement+1, last);
	    }
	}

	private void maxHeapify(Integer size, Integer index) {
		Integer right = (index + 1) << 1;
		Integer left = right - 1;
		Integer largest = 0;
	
		if (left < size && elements.get(left) > elements.get(index))
			largest = left;
		else
			largest = index;
	
		if (right < size && elements.get(right) > elements.get(largest))
			largest = right;
	
		if (largest != index) {
			swap(index, largest);
			maxHeapify(size, largest);
		}
	}
	
	public void heapSort() {
		Integer size = elements.size();
	
		for (int p = (size - 1) >> 1; p >= 0; --p)
			maxHeapify(size, p);
	
		for (Integer i = elements.size() - 1; i > 0; --i) {
			swap(i, 0);
			maxHeapify(--size, 0);
		}
	}
}
