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
@Table(name = "PLACE_SIZE")
public class PlaceSize {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name= "SIZING")
	private String sizing;
	
	@ManyToOne
	private PriceRange priceRange;

	public PlaceSize() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlaceSize(long id, String sizing, PriceRange priceRange) {
		super();
		this.id = id;
		this.sizing = sizing;
		this.priceRange = priceRange;
	}

	public long getId() {
		return id;
	}

	public String getSizing() {
		return sizing;
	}

	public void setSizing(String sizing) {
		this.sizing = sizing;
	}

	public PriceRange getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(PriceRange priceRange) {
		this.priceRange = priceRange;
	}

	@Override
	public String toString() {
		return "PlaceSize [id=" + id + ", sizing=" + sizing + ", priceRange=" + priceRange + "]";
	}
	
	
}
