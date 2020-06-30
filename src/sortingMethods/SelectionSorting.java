package sortingMethods;

import java.util.LinkedList;
import java.util.List;

public class SelectionSorting {
	List<Elements> list;
	private Elements max;
	private int index;
	
	public SelectionSorting() {
		list = new LinkedList<Elements>();		
	}
	
	public boolean sorting(List<Elements> list){
		int size = list.size()-1;
		for(int i=0;i<size;i++){
			max = list.get(size-i);
			index = size-i;
			for(int j=size-i;j>0;j--){
				if(max.compareTo(list.get(j))==-1){
					index = j;
					max = list.get(j);
				}
				list.set(index,list.get(size-i));
				list.set(size-i, max);
			}
		}
		return true;
	}
	
}
