package com.webonise.assignment.javacollection;

import java.util.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Person {
	
	private long id,age;
	private String name,college; 
	
	
	public void setId(long id) { 
		this.id = id;
	}
	public long getId() { 
		return this.id; 
	}
	
	public void setName(String name) { 
		this.name = name;
	}
	public String getName() { 
		return this.name; 
	}
   
	public void setCollege(String college) { 
		this.college = college;
	}
	public String getCollege() { 
		return this.college; 
	}
	
	public void setAge(long age) { 
		this.age = age;
	}
	public long getAge() { 
		return this.age; 
	}
	
	@Override
	public boolean equals(Object obj) {
        
		if ( obj == null )
                return false;
        if ( obj == this )
                return true;
        if ( obj.getClass() != getClass() )
                return false;
       Person rhs = (Person) obj;
       
        return new EqualsBuilder().append(id, rhs.id)
        						  .append(name, rhs.name)
        						  .append(college, rhs.college)
        						  .append(age, rhs.age).isEquals();
    }

	@Override
	public int hashCode() {
		
		return new HashCodeBuilder(1583,2179).append(id)
											 .append(name)
											 .append(college)
											 .append(age).hashCode();
	}

	
	public static void main(String args[]){
		
		List<Person> myArrayList = new ArrayList<Person>();
		
		Person[] per = new Person[5];
		for (int i = 0; i < per.length; i++) {
			per[i]=new Person();
			per[i].setId(i+1);
		}
		
		per[0].setName("anvay");
		per[0].setCollege("scoe");
		per[0].setAge(22);
		myArrayList.add(per[0]);
		
		per[1].setName("vijay");
		per[1].setCollege("mit");
		per[1].setAge(22);
		myArrayList.add(per[1]);
		
		per[2].setName("rana");
		per[2].setCollege("bvbcet");
		per[2].setAge(22);
		myArrayList.add(per[2]);
		
		per[3].setName("swpnil");
		per[3].setCollege("scoe");
		per[3].setAge(22);
		myArrayList.add(per[3]);
		
		per[4].setName("mohit");
		per[4].setCollege("scoe");
		per[4].setAge(22);
		myArrayList.add(per[4]);
		
	    for (Iterator iterator = myArrayList.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next();
			
			System.out.println("ID : "+person.getId()+" Name : "+person.getName()+" College : "+person.getCollege()+" Age : "+person.getAge());
		}
	}
}

