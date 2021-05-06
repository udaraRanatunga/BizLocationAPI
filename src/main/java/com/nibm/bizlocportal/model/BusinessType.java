/**
 * 
 */
package com.nibm.bizlocportal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author lily2
 *
 */
@Entity
@Table(name = "BUSINESS_TYPE")
public class BusinessType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name= "DESCRIPTION")
	private String description;

	public BusinessType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BusinessType(int id) {
		super();
		this.id = id;;
	}

	public BusinessType(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "BusinessType [id=" + id + ", description=" + description + "]";
	}
		
}
