/**
 * 
 */
package com.nibm.bizlocportal.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	private int id;
	
	@Column(name= "EMAIL")
	private String email;
	
	@Column(name= "NAME")
	private String name;
	
	@OneToOne
	private ColomboZone colomboZone;
	
	@OneToOne
	private BusinessType businessType;
	
	@OneToOne
	private PriceRange priceRange;
	
	@OneToOne
	private TargetGroup targetGroup;
	
//	@OneToMany
//	private List<UserBusinessGoal> businessGoal;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int id, String email, String name, ColomboZone colomboZone, BusinessType businessType,
			PriceRange priceRange, TargetGroup targetGroup) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.colomboZone = colomboZone;
		this.businessType = businessType;
		this.priceRange = priceRange;
		this.targetGroup = targetGroup;
	}


	public int getId() {
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
	

	public ColomboZone getColomboZone() {
		return colomboZone;
	}


	public void setColomboZone(ColomboZone colomboZone) {
		this.colomboZone = colomboZone;
	}


	public PriceRange getPriceRange() {
		return priceRange;
	}


	public void setPriceRange(PriceRange priceRange) {
		this.priceRange = priceRange;
	}


	public TargetGroup getTargetGroup() {
		return targetGroup;
	}


	public void setTargetGroup(TargetGroup targetGroup) {
		this.targetGroup = targetGroup;
	}


//	public List<UserBusinessGoal> getBusinessGoal() {
//		return businessGoal;
//	}
//
//
//	public void setBusinessGoal(List<UserBusinessGoal> businessGoal) {
//		this.businessGoal = businessGoal;
//	}


	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", name=" + name + ", colomboZone=" + colomboZone
				+ ", businessType=" + businessType + ", priceRange=" + priceRange + ", targetGroup=" + targetGroup
				+ ", businessGoal=]";
	}

}
