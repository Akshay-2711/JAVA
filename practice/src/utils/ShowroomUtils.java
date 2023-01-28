package utils;

import java.sql.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.app.core.Color;
import com.app.core.Vehicle;
import static utils.ValidateVehicle.validateDate;

import custom_exception.ShowroomException;

public class ShowroomUtils {

	public static List<Vehicle> populateShowroom() throws ParseException,ShowroomException
	{
		//String chasisno, Color color, double baseprice, Date manufacturedate, String company
		ArrayList<Vehicle> vehicle = new ArrayList<Vehicle>(1000);
		vehicle.add(new Vehicle("abc-222", Color.BLACK, 90000,validateDate("20-10-2022") , "TATA"));
		vehicle.add(new Vehicle("abc-444", Color.SILVER, 75000, validateDate("22-11-2022"), "HYUNDAI"));
		vehicle.add(new Vehicle("abc-111", Color.RED, 85000,validateDate("2-5-2022") , "MAHINDRA"));
		vehicle.add(new Vehicle("abc-555", Color.WHITE, 55000, validateDate("27-9-2022"), "HONDA"));
		vehicle.add(new Vehicle("abc-333", Color.CAMO, 65000, validateDate("12-7-2022"), "SUZUKI"));

		return vehicle;
		
	}

}
