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
@Table(name = "COLOMBO_ZONE")
public class ColomboZone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name= "NAME")
	private String name;
	
	@Column(name= "ZONAL_NUMBER")
	private String zonalNumber;
	
	@Column(name= "FOODIE_INDEX")
	private String foodieIndex;
	
	@Column(name= "NIGHTLIFE_INDEX")
	private String nightLifeIndex;

	@ManyToOne
	private PlaceSize placeSize;

	public ColomboZone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ColomboZone(long id, String name, String zonalNumber, String foodieIndex, String nightLifeIndex,
			PlaceSize placeSize) {
		super();
		this.id = id;
		this.name = name;
		this.zonalNumber = zonalNumber;
		this.foodieIndex = foodieIndex;
		this.nightLifeIndex = nightLifeIndex;
		this.placeSize = placeSize;
	}

	public long getId() {
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

	public PlaceSize getPlaceSize() {
		return placeSize;
	}

	public void setPlaceSize(PlaceSize placeSize) {
		this.placeSize = placeSize;
	}

	@Override
	public String toString() {
		return "ColomboZone [id=" + id + ", name=" + name + ", zonalNumber=" + zonalNumber + ", foodieIndex="
				+ foodieIndex + ", nightLifeIndex=" + nightLifeIndex + ", placeSize=" + placeSize + "]";
	}
	
	
	
}
