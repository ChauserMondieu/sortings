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
				
	}
	
	public static void printList(List<Elements> list){
		for(Elements items: list){
			System.out.println(items.toString());
		}
	}
}
