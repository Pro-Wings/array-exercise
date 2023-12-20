package com.prowings.array;

import java.util.Comparator;

public class StringDecendingComparator implements Comparator<String>{

	public int compare(String o1, String o2) {
		int res = o1.compareTo(o2);
		
		if(res >= 0)
			return -3;
		else if(res < 0)
			return 3;
		else
			return 0;
			
	}

}
