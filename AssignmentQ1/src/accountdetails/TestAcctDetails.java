package accountdetails;

import java.util.Scanner;
import static accountdetails.TransactionDetails.*;

public class TestAcctDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1)Sum of all deposits\r\n" + "2)Max deposit amount\r\n"
				+ "3)Shopping expenses (sum of withdrawals for shopping)\r\n"
				+ "4)Date on which maximum amount withdrawn");
		System.out.println("Enter the choice");
		try {
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Sum of all deposits " + sumOfDeposits());
				break;
			case 2:
				
				System.out.println(writeTransaction("02-02-2022,majja,300.0,0.0"));
				break;
			case 3:
				System.out.println("Sum of all deposits " + maxWithdrawDate());
				break;
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
