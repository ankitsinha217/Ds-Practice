package com.linkedList;
import java.util.Comparator;


 class RollComparator implements Comparator<Studentt>{  
	 public int compare(Studentt s1,Studentt s2)
	 {
		if(s1.rollno==s2.rollno)
			return 0;
		else if(s1.rollno>s2.rollno)
			return 1;
		else 
			return -1;
	 
	 }

}
