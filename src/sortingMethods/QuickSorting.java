package sortingMethods;

import java.util.LinkedList;
import java.util.List;

public class QuickSorting {
	private List<Elements> list;
	
	public QuickSorting() {
		// TODO Auto-generated constructor stub
		list = new LinkedList<Elements>();
	}
	
	public boolean sorting(List<Elements> list, int low, int high){
		int i =low;
		int j = high;
		Elements temp; 
		Elements std = list.get(low);
		if(low > high){
			return false;
		}
		while(i < j){
			while(list.get(j).compareTo(std)==1){
				j --;
			}
			while(list.get(i).compareTo(std)==-1){
				i ++;
			}
			if(i<j){
				temp = list.get(j);
				list.set(j, list.get(i));
				list.set(i, temp);
			}
		}
		// at last i=j
		list.set(low, list.get(i));
		list.set(i, std);
		if(i-1>low || i+1<high){
			sorting(list, low, i-1);
			sorting(list, i+1, high);			
		}
		return true;
	}
}
