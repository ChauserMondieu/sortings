package sortingMethods;

import java.util.List;
import java.util.LinkedList;

public class BubbleSorting {
	List<Elements> list;
	private boolean flag = true;
	
	public BubbleSorting() {
		list = new LinkedList<Elements>();
	}

	public boolean sorting(List<Elements> list){
		Elements temp = new Elements();
		// or
		// for(int i=0;i<list.size;i++){
		//		for(int j=list.size();j>i+1;j--){
		//			if(list.get(j).compareTo(list.get(j-1))==-1){
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

}
