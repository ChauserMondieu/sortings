package sortingMethods;

import java.util.LinkedList;
import java.util.List;

public class Testing {
	
	public static void main(String[] args) {
		// Original data
		List<Elements> list = new LinkedList<Elements>();
		list.add(new Elements(23,"name1"));
		list.add(new Elements(1,"name2"));
		list.add(new Elements(8,"name3"));
		list.add(new Elements(3,"name4"));
		list.add(new Elements(15,"name5"));
		list.add(new Elements(7,"name6"));
		list.add(new Elements(45,"name7"));
		list.add(new Elements(59,"name8"));
		list.add(new Elements(21,"name9"));
		list.add(new Elements(35,"name10"));
		list.add(new Elements(24,"name11"));
		
		// test for bubble sorting
		BubbleSorting bs = new BubbleSorting();
		long start1 = System.currentTimeMillis();
		bs.sorting(list);
		printList(list);
		long end1 = System.currentTimeMillis();
		System.out.println("Bubble total time: " + (end1-start1) + "ms.");
		
		// test for selection sort
		SelectionSorting ss = new SelectionSorting();
		long start2 = System.currentTimeMillis();
		ss.sorting(list);
		printList(list);
		long end2 = System.currentTimeMillis();
		System.out.println("Selection total time: " + (end2-start2) + "ms.");
		
		// test for insert sort
		InsertSorting is = new InsertSorting();
		long start4 = System.currentTimeMillis();
		is.sorting(list);
		printList(list);
		long end4 = System.currentTimeMillis();
		System.out.println("insert total time: " + (end4-start4) + "ms.");
		
		// test for quick sort
		QuickSorting qs = new QuickSorting();
		long start3 = System.currentTimeMillis();
		qs.sorting(list,0,list.size()-1);
		printList(list);
		long end3 = System.currentTimeMillis();
		System.out.println("quick total time: " + (end3-start3) + "ms.");
				
	}
	
	public static void printList(List<Elements> list){
		for(Elements items: list){
			System.out.println(items.toString());
		}
	}
}
