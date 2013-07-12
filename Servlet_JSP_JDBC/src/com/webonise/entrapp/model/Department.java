package com.webonise.entrapp.model;

import java.io.Serializable;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author Anvay The department class contain all properties of department database
 * 				 and class contain getter and setter properties 
 *
 */
public class Department implements Serializable { 
	/**
	 * 
	 */
	private static final long serialVersionUID = -2653715358214609237L;
	private int id;
	private String name;

	public void setInfo(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (obj.getClass() != getClass())
			return false;
		Department dep = (Department) obj;
		return new EqualsBuilder().append(id, dep.id).append(name, dep.name)
				.isEquals();
	}

	@Override
	public int hashCode() {

		return new HashCodeBuilder(1583, 2179).append(id).append(name)
				.hashCode();
	}
}
