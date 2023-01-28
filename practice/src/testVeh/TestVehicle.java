package testVeh;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import static utils.ShowroomUtils.populateShowroom;
import static utils.ValidateVehicle.*;

import com.app.core.Color;
import com.app.core.Vehicle;

import custom_exception.ShowroomException;
import custom_ordering.VehicleManComp;

public class TestVehicle {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			
			List<Vehicle> list = populateShowroom();
			 boolean exit=false;
			 
			 while(!exit)
			 {
				 System.out.println("1.Add a Vehicle 2.Display all vehicles 3.Display all vehicles having specified color"
						 + "4. Apply discount to a particular vehicle 5. Purchase a vehicle "
						 + "6. Remove vehilce details 7. Sort vehicle details as per chasis no "
						 + "8. Sort vehicle details , as per date  : custom ordering , using separate comparator class"
						 + "9. Sort vehicle details , as per date  : custom ordering , using ano inner class"
						 + "10. Sort vehicle details , as per date  n price : custom ordering , using ano inner class"
						 + "100. Exit");
				 System.out.println("Enter choice");
				 try {
					 
					 switch(sc.nextInt())
					 {
					 case 1:
						System.out.println("enter chasisno,  color,  baseprice,  manufacturedate,  company");
					 Vehicle v1= new Vehicle(validateChasisNo(sc.next(), list), validateColor(sc.next()), validatePrice(sc.nextDouble()), validateDate(sc.next()), sc.next());
					 list.add(v1);
					 System.out.println("Vehicle added successfully!!!");
					 break;
					 
					 case 2:
						 System.out.println("Vehciles in the showroom:");
						 for(Vehicle v:list )
						 {
							 if(v!=null)
							System.out.println(v);
						 }
						 break;
						 
					 case 3:
						 System.out.println("Enter the color");
						 Color chosenclr=validateColor(sc.next());
						 for(Vehicle v:list)
						 {
							 if(v.getColor().equals(chosenclr))
								 System.out.println(v);
						 }
						 break;
						 
					 case 4:
						 System.out.println("Enter chasis no and discount");
						 String chno=sc.next();
						 double discount=sc.nextDouble();
						 Vehicle foundvehicle= findByChasisNo(chno, list);
						 foundvehicle.setBaseprice(foundvehicle.getBaseprice()-discount);
						 System.out.println("Discount applied");
						 break;
						 
					 case 5:
						 sc.nextLine();
						 System.out.println("Enter chasisno");
						 chno=sc.nextLine();
						 foundvehicle=findByChasisNo(chno, list);
						 //vehicle available
						 if(foundvehicle.getAddress()==null)
						 {
							 System.out.println("enter addressLine1, addressLine2,  city,  state,  country, zip"); 
							 foundvehicle.linkAddress(sc.nextLine(), sc.nextLine(), sc.next(), sc.next(), sc.next(), sc.next());
						 }
							 
						 else
							 throw new ShowroomException("Vehicle not available for purchasing");
						 break;
						 
					 case 6:
						 System.out.println("Enter the chasisno to remove");
						 chno=sc.next();
						
						 Vehicle v=new Vehicle(chno);
						 if(list.remove(chno))
							 System.out.println("Vehicle details removed");
						 
						 else
							 throw new ShowroomException("invalid chasis no!!");
						break;
						
					 case 7:
//						 Sort vehicle details as per chasis no
						 Collections.sort(list);
						 break;
						 
					 case 8:
//						 8. Sort vehicle details , as per date  : custom ordering , using separate comparator class		
						 Collections.sort(list, new VehicleManComp());
						 break;
						 
						 
					 case 10:
						 exit=true;
						 break;
						 
					 }
					 
					 
				 }catch (Exception e) {
					// TODO: handle exception
				}
				 
				 
				 
				 
			 }
				 
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
