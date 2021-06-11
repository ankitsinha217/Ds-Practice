package com.datastructurePractice;

import java.util.Comparator;
import java.util.Date;

public class Employee implements Comparable<Employee> {
	    private int id;
	    private String name;
	    private int salary;
	    private int age;
	    private Date dateOfJoining;
	    
	    public static final Comparator<Employee> ages = new Comparator<Employee>()
	    		{
	    	@Override
	    	public int compare(Employee e1,Employee e2)
	    	{
	    		return e1.age-e2.age;
	    	}
	    };
	    
	    public static final Comparator<Employee> salaryy = new Comparator<Employee>()
	    		{
	    	@Override
	    	
	    	public int compare(Employee e3,Employee e4)
	    	{
	    	
	    		return e3.salary - e4.salary;
	    	}
	    };
	    
	    public static final Comparator<Employee> namee= new Comparator<Employee>()
	    		{
	    	@Override
	    	public int compare(Employee e5,Employee e6)
	    	{
	    		return e5.name.compareTo(e6.name);
	    	}
	   };
	   
	   public static final Comparator<Employee> ids= new Comparator<Employee>()
			   {
		   @Override
		   public int compare(Employee e7,Employee e8)
		   {
			   return e7.id - e8.id;
		   }
	};
	    		  
	    @Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", dateOfJoining="
					+ dateOfJoining + "]";
		}
		public Employee(int id, String name, int salary, int age, Date dateOfJoining) {
			
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.age = age;
			this.dateOfJoining = dateOfJoining;
		}
		@Override
	    public int compareTo(Employee o) {
	        return this.id - o.id;
	    }

}
        
	    
   

	