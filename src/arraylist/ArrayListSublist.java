package arraylist;

import java.util.ArrayList;

public class ArrayListSublist {
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(15);
		list.add(19);
		list.add(49);
		list.add(78);
		
		ArrayList<Integer> sublist=new ArrayList<>(list.subList(1, 4));
		System.out.println(sublist);
	}

}
