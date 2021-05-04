/**
 * 
 */
package com.nibm.bizlocportal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author lily2
 *
 */
@Entity
@Table(name = "BIZ_USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name= "EMAIL")
	private String email;
	
	@Column(name= "NAME")
	private String name;
	
	@OneToOne
	private BusinessType businessType;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long id, String email, String name, BusinessType businessType) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.businessType = businessType;
	}

	public long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BusinessType getBusinessType() {
		return businessType;
	}

	public void setBusinessType(BusinessType businessType) {
		this.businessType = businessType;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", name=" + name + ", businessType=" + businessType + "]";
	}

}
