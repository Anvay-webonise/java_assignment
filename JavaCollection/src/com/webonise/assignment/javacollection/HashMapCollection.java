package com.webonise.assignment.javacollection;

import java.util.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class HashMapCollection {
	
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
        HashMapCollection rhs = (HashMapCollection) obj;
       
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
		
		Map<Long,String> myMap = new HashMap <Long,String>();
		
		HashMapCollection [] hmc = new HashMapCollection [5];
		for (int i = 0; i < hmc.length; i++) {
			hmc[i]=new HashMapCollection();
			hmc[i].setId(i+1);
		}
		
		hmc[0].setName("anvay");
		hmc[0].setCollege("scoe");
		hmc[0].setAge(22);
		myMap.put(hmc[0].getId(),hmc[0].getName());
		
		hmc[1].setName("vijay");
		hmc[1].setCollege("mit");
		hmc[1].setAge(22);
		myMap.put(hmc[1].getId(),hmc[1].getName());
		
		hmc[2].setName("rana");
		hmc[2].setCollege("bvbcet");
		hmc[2].setAge(22);
		myMap.put(hmc[2].getId(),hmc[2].getName());
		
		hmc[3].setName("swpnil");
		hmc[3].setCollege("scoe");
		hmc[3].setAge(22);
		myMap.put(hmc[3].getId(),hmc[3].getName());
		
		hmc[4].setName("mohit");
		hmc[4].setCollege("scoe");
		hmc[4].setAge(22);
		myMap.put(hmc[4].getId(),hmc[4].getName());
		
		for (int i = 0; i < hmc.length; i++) {
			
			System.out.println(myMap.get(hmc[i].getId()));
		}
		
		System.out.println(myMap.get(5));// It will print the null value because in hashmap no value is present
											//which key is 5;
	}
}
