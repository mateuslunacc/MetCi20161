import java.util.ArrayList;

public class QuickSort {

	private ArrayList<Integer> elements;
	
	public QuickSort() {
		this.elements = new ArrayList<>();
	}
	
	public QuickSort(ArrayList<Integer> data) {
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
	
	public Integer size() {
		return elements.size();
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
	
	public void sort(Integer first, Integer last ) {
		Integer pivotElement;
	 
	    if(first < last) {
	        pivotElement = this.pivot(first, last);
	        
	        sort(first, pivotElement-1);
	        sort(pivotElement+1, last);
	    }
	}

}
