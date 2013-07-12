package com.webonise.entrapp.model;

import java.io.Serializable;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author Anvay The employee class contain all the properties which are present in database
 * 				 and on which setter and getter method are perform
 *
 */
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3386765128406236014L;
	private int id;
	private int did;
	private String name;
	private String dob;

	public void setInfo(int id, String name, int did, String dob) {
		this.id = id;
		this.did = did;
		this.name = name;
		this.dob = dob;
	}

	public int getID() {
		return id;
	}

	public int getDepartmentId() {
		return did;
	}

	public String getName() {
		return name;
	}

	public String getDateOfBirth() {
		return dob;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (obj.getClass() != getClass())
			return false;
		Employee emp = (Employee) obj;

		return new EqualsBuilder().append(id, emp.id).append(name, emp.name)
				.append(did, emp.did).append(dob, emp.dob).isEquals();
	}

	@Override
	public int hashCode() {

		return new HashCodeBuilder(1583, 2179).append(id).append(name)
				.append(did).append(dob).hashCode();
	}
}
