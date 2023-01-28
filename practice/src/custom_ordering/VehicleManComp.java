package custom_ordering;

import java.util.Comparator;

import com.app.core.Vehicle;

public class VehicleManComp implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle v1, Vehicle v2) {
		// TODO Auto-generated method stub
		return v1.getManufacturedate().compareTo(v2.getManufacturedate());
	}
	
	

}
