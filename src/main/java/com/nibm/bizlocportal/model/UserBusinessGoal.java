/**
 * 
 */
package com.nibm.bizlocportal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author lily2
 *
 */
@Entity
@Table(name = "BIZ_USER_BUSINESS_GOAL")
public class UserBusinessGoal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private BusinessGoal businessGoal;

	public UserBusinessGoal(int id, User user, BusinessGoal businessGoal) {
		super();
		this.id = id;
		this.user = user;
		this.businessGoal = businessGoal;
	}

	public UserBusinessGoal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public BusinessGoal getBusinessGoal() {
		return businessGoal;
	}

	public void setBusinessGoal(BusinessGoal businessGoal) {
		this.businessGoal = businessGoal;
	}

	@Override
	public String toString() {
		return "UserBusinessGoal [id=" + id + ", user=" + user + ", businessGoal=" + businessGoal + "]";
	}
	
	

}
