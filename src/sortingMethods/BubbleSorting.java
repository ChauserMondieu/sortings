package sortingMethods;

import java.util.List;
import java.util.LinkedList;

public class BubbleSorting {
	private List<Elements> list;
	private boolean flag = true;
	
	public BubbleSorting() {
		list = new LinkedList<Elements>();
	}

	public boolean sorting(List<Elements> list){
		Elements temp = new Elements();
		for(int i=list.size();i>0;i--){
			flag = true;
			for(int j=0;j<i-1;j++){
				if(list.get(j).compareTo(list.get(j+1))==1){
					temp = list.get(j+1);
					list.set(j+1,list.get(j));
					list.set(j, temp);
					flag = false;
				}
			}
			if(flag){
				return true;
			}
		}
		return true;
	}
	
	public void printList(List<Elements> list){
		for(Elements items : list){
			System.out.println(items.getId() + " -> " + items.getContent());
		}
	}
	
	public static void main(String[] args) {
		BubbleSorting bs = new BubbleSorting();
		List<Elements> list = bs.list;
		
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
		
		long start = System.currentTimeMillis();
		bs.sorting(list);
		bs.printList(list);
		long end = System.currentTimeMillis();
		System.out.println("Total time: " + (end-start) + "ms.");
	}
}
