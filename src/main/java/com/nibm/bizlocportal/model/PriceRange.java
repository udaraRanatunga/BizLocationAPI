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
@Table(name = "PRICE_RANGE")
public class PriceRange {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name= "RANGE")
	private String range;

	
	public PriceRange() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PriceRange(int id) {
		super();
		this.id = id;
	}


	public PriceRange(int id, String range) {
		super();
		this.id = id;
		this.range = range;
	}


	public long getId() {
		return id;
	}

	
	public String getRange() {
		return range;
	}


	public void setRange(String range) {
		this.range = range;
	}


	@Override
	public String toString() {
		return "PriceRange [id=" + id + ", range=" + range + "]";
	}
	
	
}
