package com.linkedList;

import java.util.Comparator;

class NameComparator implements Comparator<Studentt>{  
public int compare(Studentt s1,Studentt s2){  
return s1.name.compareTo(s2.name);  
}  
}  