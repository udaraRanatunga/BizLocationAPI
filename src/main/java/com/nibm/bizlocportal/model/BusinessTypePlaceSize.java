/**
 * 
 */
package com.nibm.bizlocportal.model;

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
@Table(name = "BUSINESSTYPE_PLACESIZE")
public class BusinessTypePlaceSize {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	private BusinessType businessType;
	
	@ManyToOne
	private PlaceSize placeSize;

	public BusinessTypePlaceSize() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessTypePlaceSize(int id, BusinessType businessType, PlaceSize placeSize) {
		super();
		this.id = id;
		this.businessType = businessType;
		this.placeSize = placeSize;
	}

	public int getId() {
		return id;
	}

	public BusinessType getBusinessType() {
		return businessType;
	}

	public void setBusinessType(BusinessType businessType) {
		this.businessType = businessType;
	}

	public PlaceSize getPlaceSize() {
		return placeSize;
	}

	public void setPlaceSize(PlaceSize placeSize) {
		this.placeSize = placeSize;
	}

	@Override
	public String toString() {
		return "BusinessTypePlaceSize [id=" + id + ", businessType=" + businessType + ", placeSize=" + placeSize + "]";
	}
	
}
