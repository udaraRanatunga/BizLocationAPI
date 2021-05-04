/**
 * 
 */
package com.nibm.bizlocportal.model;

import javax.persistence.*;

/**
 * @author lily2
 *
 */
@Entity
@Table(name = "BUSINESSTYPE_TARGETGROUP")
public class BusinessTypeTargetGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	private BusinessType businessType;
	
	@ManyToOne
	private TargetGroup targetGroup;

	public BusinessTypeTargetGroup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessTypeTargetGroup(long id, BusinessType businessType, TargetGroup targetGroup) {
		super();
		this.id = id;
		this.businessType = businessType;
		this.targetGroup = targetGroup;
	}

	public long getId() {
		return id;
	}

	public BusinessType getBusinessType() {
		return businessType;
	}

	public void setBusinessType(BusinessType businessType) {
		this.businessType = businessType;
	}

	public TargetGroup getTargetGroup() {
		return targetGroup;
	}

	public void setTargetGroup(TargetGroup targetGroup) {
		this.targetGroup = targetGroup;
	}

	@Override
	public String toString() {
		return "BusinessTypeTargetGroup [id=" + id + ", businessType=" + businessType + ", targetGroup=" + targetGroup
				+ "]";
	}
	
}
