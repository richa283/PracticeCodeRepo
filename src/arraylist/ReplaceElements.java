package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ReplaceElements {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(15);
		list.add(19);
		list.add(49);
		list.add(78);
		
		Collections.replaceAll(list, 19, 34); //replaced 19 with 34
		System.out.println(list);
	}

}
