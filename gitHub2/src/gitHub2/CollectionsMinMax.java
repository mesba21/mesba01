package gitHub2;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMinMax {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(1);
		list.add(100);
		
		int mini = Collections.min(list);
		int max = Collections.max(list);
		
		System.out.println(mini);
		System.out.println(max);
		
	}

}
