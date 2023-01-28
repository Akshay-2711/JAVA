package com.app.core;

import java.util.Date;
import java.text.SimpleDateFormat;

import com.app.core.Vehicle.DeliveryAddress;

/*Accept vehicle details : chasisNo(string) : UNIQUE (PK), color(enum : Color) , 
* basePrice(double) , manufactureDate(Date),company*/

public class Vehicle implements Comparable<Vehicle> {
	private String chasisno;
	private Color color;
	private double baseprice;
	private Date manufacturedate;
	private String company;
	private DeliveryAddress address;

	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-mm-yyyy");
	}

	public Vehicle(String chasisno, Color color, double baseprice, Date manufacturedate, String company) 
	{
		super();
		this.chasisno = chasisno;
		this.color = color;
		this.baseprice = baseprice;
		this.manufacturedate = manufacturedate;
		this.company = company;
	}

	public Vehicle(String chasisno) {
		super();
		this.chasisno = chasisno;
	}
	
	public boolean equals(Object anothervehicle)
	{
		System.out.println("In vehicle Equals");
		if(anothervehicle instanceof Vehicle)
			return this.chasisno.equals(((Vehicle)anothervehicle).chasisno);
		
		return false;
		
	}
	
	@Override
	public String toString() {
		String mesg = address == null ? "Address not yet assigned!" : address.toString();
		return "Vehicle chasisno=" + chasisno + ", color=" + color + ", baseprice=" + baseprice + ", manufacturedate="
				+ sdf.format(manufacturedate) + ", company=" + company +" "+mesg ;
	}

	@Override
	public int compareTo(Vehicle anotervehicle) {
		return this.chasisno.compareTo(anotervehicle.chasisno);
		
	}
	
	public void linkAddress(String addressLine1, String addressLine2, String city, String state, String country,
			String zip) {
		this.address=new DeliveryAddress(addressLine1, addressLine2, city, state, country, zip);
		System.out.println("delivery address assigned...");
	}

	public Date getManufacturedate() {
		return manufacturedate;
	}

	public void setManufacturedate(Date manufacturedate) {
		this.manufacturedate = manufacturedate;
	}

	public String getChasisno() {
		return chasisno;
	}

	public void setChasisno(String chasisno) {
		this.chasisno = chasisno;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getBaseprice() {
		return baseprice;
	}

	public void setBaseprice(double baseprice) {
		this.baseprice = baseprice;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public DeliveryAddress getAddress() {
		return address;
	}

	public void setAddress(DeliveryAddress address) {
		this.address = address;
	}
	
	//innerclass begins
	public class DeliveryAddress
	{
		private String addressline1;
		private String addressline2;
		private String city;
		private String state;
		private String country;
		private String zipcode;
		public DeliveryAddress(String addressline1, String addressline2, String city, String state, String country,
				String zipcode) {
			super();
			this.addressline1 = addressline1;
			this.addressline2 = addressline2;
			this.city = city;
			this.state = state;
			this.country = country;
			this.zipcode = zipcode;
		}
		@Override
		public String toString() {
			return "DeliveryAddress [addressline1=" + addressline1 + ", addressline2=" + addressline2 + ", city=" + city
					+ ", state=" + state + ", country=" + country + ", zipcode=" + zipcode + "]";
		}
		
		
	}//innerclass

}
