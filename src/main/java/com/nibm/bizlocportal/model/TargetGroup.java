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
@Table(name = "TARGET_GROUP")
public class TargetGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name= "TARGET_GROUP")
	private String targetGroup;

	@Column(name= "PURCHASE_POWER")
	private String purchasePower;

	public TargetGroup() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TargetGroup(int id) {
		super();
		this.id = id;
	}
	public TargetGroup(int id, String targetGroup, String purchasePower) {
		super();
		this.id = id;
		this.targetGroup = targetGroup;
		this.purchasePower = purchasePower;
	}

	public int getId() {
		return id;
	}

	public String getTargetGroup() {
		return targetGroup;
	}

	public void setTargetGroup(String targetGroup) {
		this.targetGroup = targetGroup;
	}

	public String getPurchasePower() {
		return purchasePower;
	}

	public void setPurchasePower(String purchasePower) {
		this.purchasePower = purchasePower;
	}

	@Override
	public String toString() {
		return "TargetGroup [id=" + id + ", targetGroup=" + targetGroup + ", purchasePower=" + purchasePower + "]";
	}
	
	
}
