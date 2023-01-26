package Tester;

import java.time.LocalDate;
import java.util.Scanner;
import static utils.IOutils.*;
import com.app.banking.AccountType;
import com.app.banking.Bank;

public class Storedetails {

	public static void main(String[] args) {
		
		
		try(Scanner sc =new Scanner(System.in)){
			System.out.println("Enter the filename");
			String s= sc.nextLine();
			
			Bank b=readDetails(s);
			System.out.println("Details stored"+b);
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
