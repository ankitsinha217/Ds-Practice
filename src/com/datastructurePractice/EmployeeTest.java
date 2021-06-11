package com.datastructurePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1= new Employee(1, "A", 1000, 32, new Date(2011, 10, 1));
		Employee e2 = new Employee(2, "AB", 1300, 22, new Date(2012, 10, 1));
        Employee e3 = new Employee(3, "B", 10, 42, new Date(2010, 11, 3));
        Employee e4 = new Employee(6, "CD", 100, 23, new Date(2011, 10, 1));
        Employee e5 = new Employee(5, "AAA", 1200, 26, new Date(2011, 10, 1));
        List<Employee> list = new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        //System.out.println("Unsorted: " + list);
      //  Collections.sort(list);
        Collections.sort(list, Employee.ages);
      //  System.out.println(list);
        Collections.sort(list,Employee.salaryy);
      //  System.out.print(list);
        Collections.sort(list,Employee.namee);
        //System.out.print(list);
        Collections.sort(list,Employee.ids);
        System.out.println(list);
	
	}

}
