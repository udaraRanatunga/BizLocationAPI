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
@Table(name = "TOP_CUISINES")
public class TopCuisines {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name= "Name")
	private String name;
	
	@ManyToOne
	private ColomboZone colomboZone;

	public TopCuisines() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public TopCuisines(int id, String name, ColomboZone colomboZone) {
		super();
		this.id = id;
		this.name = name;
		this.colomboZone = colomboZone;
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

	public ColomboZone getColomboZone() {
		return colomboZone;
	}

	public void setColomboZone(ColomboZone colomboZone) {
		this.colomboZone = colomboZone;
	}


	@Override
	public String toString() {
		return "TopCuisines [id=" + id + ", name=" + name + ", colomboZone=" + colomboZone + "]";
	}
	
	
}
