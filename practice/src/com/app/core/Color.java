package com.app.core;

public enum Color 
{
	RED(2500),BLACK(8000),WHITE(2000),CAMO(6000),SILVER(5000);

	private double additionalcost;

	private Color(double additionalcost) {
		this.additionalcost = additionalcost;
	}

	public double getAdditionalcost() {
		return additionalcost;
	}

	public void setAdditionalcost(double additionalcost) {
		this.additionalcost = additionalcost;
	}
	
	
	
	
	
	
}
