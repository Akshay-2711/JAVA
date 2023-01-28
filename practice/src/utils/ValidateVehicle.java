package utils;

import static com.app.core.Vehicle.sdf;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import com.app.core.Color;
import com.app.core.Vehicle;

import custom_exception.ShowroomException;
public class ValidateVehicle {
	private static final double MAXPRICE;
	private static final double MINPRICE;
	public static Date beginDate;
	public static Date endDate;
	
	static {
		MAXPRICE=1000000;
		MINPRICE=100000;
		
		try {
			beginDate=sdf.parse("01-04-2022");
			endDate=sdf.parse("31-03-2023");
			
		}catch (ParseException e) {
			System.out.println("Error in date i static "+e);
		}
		
	}
	
	public static double validatePrice(double price) throws ShowroomException
	{
		if(price < MINPRICE || price> MAXPRICE)
			throw new ShowroomException("Price out of range");
		return price;
	}
	
	public static Color validateColor(String clr) throws ShowroomException
	{
		
		try {
			return Color.valueOf(clr.toUpperCase());
			
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		throw new ShowroomException("Enter valid color");
			
		
		
		
		
	}

	public static Date validateDate(String date) throws  ShowroomException, ParseException
	{
		Date mdf= sdf.parse(date);
		if(mdf.before(beginDate) || mdf.after(endDate))
			throw new ShowroomException("Invalid date!!");
				
		return mdf;
	}
	
	public  static String validateChasisNo(String chno,List<Vehicle> vehicle) throws ShowroomException
	{
		
		Vehicle veh = new Vehicle(chno);
		if(vehicle.contains(chno))
			throw new ShowroomException("Duplicates Detected!!");
		return chno;
		
	}
	
	public static Vehicle findByChasisNo(String chno,List<Vehicle> veh) throws ShowroomException
	{
		Vehicle v=new Vehicle(chno);
		
		int index=veh.indexOf(v);
		if(index==-1)
			throw new ShowroomException("Vehicle Not found!!!");
		
		return veh.get(index);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
