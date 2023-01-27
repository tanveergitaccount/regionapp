package com.region.controller;

import lombok.Data;

@Data
public class RegionDto {
	
	
	private int id;
	private String Name;
	private String Region;
	private long LandMass;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	public long getLandMass() {
		return LandMass;
	}
	public void setLandMass(long landMass) {
		LandMass = landMass;
	}
	
	
	
	
	
	
	
	
	

}
