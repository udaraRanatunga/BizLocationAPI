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
@Table(name = "COLOMBO_ZONE")
public class ColomboZone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name= "NAME")
	private String name;
	
	@Column(name= "ZONAL_NUMBER")
	private String zonalNumber;
	
	@Column(name= "LATITUDE")
	private String lat;
	
	@Column(name= "LONGITUDE")
	private String longitude;

	
	@Column(name= "FOODIE_INDEX")
	private String foodieIndex;
	
	@Column(name= "NIGHTLIFE_INDEX")
	private String nightLifeIndex;
	
	@Column(name= "AVERAGE_COST")
	private String averageCost;
	
	@Column(name= "AVERAGE_RATING")
	private String averageRating;



	public ColomboZone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ColomboZone(int id) {
		super();
		this.id = id;
		// TODO Auto-generated constructor stub
	}

	
	
	public ColomboZone(int id, String name, String zonalNumber, String lat, String longitude, String foodieIndex,
			String nightLifeIndex, String averageCost, String averageRating) {
		super();
		this.id = id;
		this.name = name;
		this.zonalNumber = zonalNumber;
		this.lat = lat;
		this.longitude = longitude;
		this.foodieIndex = foodieIndex;
		this.nightLifeIndex = nightLifeIndex;
		this.averageCost = averageCost;
		this.averageRating = averageRating;
	}



	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZonalNumber() {
		return zonalNumber;
	}

	public void setZonalNumber(String zonalNumber) {
		this.zonalNumber = zonalNumber;
	}

	public String getFoodieIndex() {
		return foodieIndex;
	}

	public void setFoodieIndex(String foodieIndex) {
		this.foodieIndex = foodieIndex;
	}

	public String getNightLifeIndex() {
		return nightLifeIndex;
	}

	public void setNightLifeIndex(String nightLifeIndex) {
		this.nightLifeIndex = nightLifeIndex;
	}


	public String getAverageCost() {
		return averageCost;
	}



	public void setAverageCost(String averageCost) {
		this.averageCost = averageCost;
	}



	public String getAverageRating() {
		return averageRating;
	}


	public void setAverageRating(String averageRating) {
		this.averageRating = averageRating;
	}


	public String getLat() {
		return lat;
	}



	public void setLat(String lat) {
		this.lat = lat;
	}



	public String getLongitude() {
		return longitude;
	}



	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}



	@Override
	public String toString() {
		return "ColomboZone [id=" + id + ", name=" + name + ", zonalNumber=" + zonalNumber + ", lat=" + lat
				+ ", longitude=" + longitude + ", foodieIndex=" + foodieIndex + ", nightLifeIndex=" + nightLifeIndex
				+ ", averageCost=" + averageCost + ", averageRating=" + averageRating + "]";
	}



	
}
