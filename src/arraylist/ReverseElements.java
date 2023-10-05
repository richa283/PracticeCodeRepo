package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(798);
		list.add(6457);
		list.add(4254);
		list.add(6574);
		
		Collections.reverse(list);
		System.out.println(list);
	}
}
