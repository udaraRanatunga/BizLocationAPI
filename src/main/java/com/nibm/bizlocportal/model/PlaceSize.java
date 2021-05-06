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
	private int id;
	
	@Column(name= "SIZING")
	private String sizing;
	
	@ManyToOne
	private PriceRange priceRange;
	
	@ManyToOne
	private ColomboZone colomboZone;

	public PlaceSize() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public PlaceSize(int id, String sizing, PriceRange priceRange, ColomboZone colomboZone) {
		super();
		this.id = id;
		this.sizing = sizing;
		this.priceRange = priceRange;
		this.colomboZone = colomboZone;
	}



	public int getId() {
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



	public ColomboZone getColomboZone() {
		return colomboZone;
	}



	public void setColomboZone(ColomboZone colomboZone) {
		this.colomboZone = colomboZone;
	}



	@Override
	public String toString() {
		return "PlaceSize [id=" + id + ", sizing=" + sizing + ", priceRange=" + priceRange + ", colomboZone="
				+ colomboZone + "]";
	}


	
	
}
