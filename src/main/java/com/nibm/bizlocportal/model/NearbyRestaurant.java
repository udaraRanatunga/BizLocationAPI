/**
 * 
 */
package com.nibm.bizlocportal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author lily2
 *
 */
@Entity
@Table(name = "NEARBY_RESTAURANT")
public class NearbyRestaurant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name= "RESTAURANT_TYPE")
	private String restaurantType;
	
	@Column(name= "NO_OF_OUTLETS")
	private String noOfOutlets;
	
	@ManyToOne
	private ColomboZone colomboZone;

	public NearbyRestaurant() {
		super();
		// TODO Auto-generated constructor stub
	}



	public NearbyRestaurant(int id, String restaurantType, String noOfOutlets, ColomboZone colomboZone) {
		super();
		this.id = id;
		this.restaurantType = restaurantType;
		this.noOfOutlets = noOfOutlets;
		this.colomboZone = colomboZone;
	}



	public int getId() {
		return id;
	}



	public String getRestaurantType() {
		return restaurantType;
	}



	public String getNoOfOutlets() {
		return noOfOutlets;
	}



	public void setRestaurantType(String restaurantType) {
		this.restaurantType = restaurantType;
	}



	public void setNoOfOutlets(String noOfOutlets) {
		this.noOfOutlets = noOfOutlets;
	}



	public ColomboZone getColomboZone() {
		return colomboZone;
	}



	public void setColomboZone(ColomboZone colomboZone) {
		this.colomboZone = colomboZone;
	}



	@Override
	public String toString() {
		return "NearbyRestaurant [id=" + id + ", restaurantType=" + restaurantType + ", noOfOutlets=" + noOfOutlets
				+ ", colomboZone=" + colomboZone + "]";
	}



	
	
	
}
