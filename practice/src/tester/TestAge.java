package tester;

import java.util.Scanner;
import static code.Agecheck.ageChecker;
public class TestAge {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			
			System.out.println("Enter the age");
			ageChecker(sc.nextInt());
			System.out.println("End of try...");
						
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
