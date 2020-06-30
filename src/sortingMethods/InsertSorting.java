package sortingMethods;

import java.util.LinkedList;
import java.util.List;

public class InsertSorting {
	private List<Elements> list;
	
	public InsertSorting() {
		// TODO Auto-generated constructor stub
		list = new LinkedList<Elements>();
	}
	
	public boolean sorting(List<Elements> list){
		Elements temp;
		int size = list.size()-1;
		for(int i=1; i<size;i++){
			temp = list.get(i);
			for(int j=i;j>0;j--){
				if(temp.compareTo(list.get(j-1))==-1){
					list.set(j, list.get(j-1));
					list.set(j-1, temp);
				}
			}
		}
		return true;
	}
}
