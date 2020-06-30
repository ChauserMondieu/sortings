package sortingMethods;

import java.util.List;
import java.util.LinkedList;

public class BubbleSorting {
	private static List<Elements> list;
	private boolean flag = true;
	
	public BubbleSorting() {
		list = new LinkedList<Elements>();
	}

	public boolean sorting(List<Elements> list){
		for(int i=list.size();i>0;i--){
			for(int j=0;j<i;j++){
				if(list.get(j).compareTo(list.get(j+1))){
					
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		list.add(new Elements(23,"name1"));
		list.add(new Elements(35,"name2"));
		list.add(new Elements(8,"name3"));
		list.add(new Elements(3,"name4"));
		list.add(new Elements(15,"name5"));
		list.add(new Elements(7,"name6"));
		list.add(new Elements(45,"name7"));
		list.add(new Elements(59,"name8"));
		list.add(new Elements(21,"name9"));
		list.add(new Elements(1,"name10"));
		list.add(new Elements(24,"name11"));
	}
}
