package Tester;

import static utils.BankUtils.populateBank;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import static utils.BankUtils.validateBalance;
import static utils.BankUtils.validateAccountType;
import com.app.banking.Bank;

import exception.BankingException;

public class TestBank {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			Map<Integer, Bank> accts = populateBank();

			boolean exit = false;
			while (!exit) {

				System.out.println("Options 1. Create A/C 2. Display all accts 3. Fetch A/C Summary "
						+ "4. Transfer Funds 5. Close A/c 100.Exit");
				System.out.println("Enter the choice");

				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter account No");
						int acctno = sc.nextInt();
						if (!accts.containsKey(acctno)) {
							System.out
									.println("Enter other details : customerName,  balance,  acType,  creationDate   ");
							accts.put(acctno, new Bank(acctno, sc.next(), validateBalance(sc.nextInt()),
									validateAccountType(sc.next()), LocalDate.parse(sc.next())));
							System.out.println("Account added successfully!!!");
						} else
							throw new BankingException("Account no already exists!!!");
						break;

					case 2:

						for (Bank b : accts.values()) {
							System.out.println(b);
						}
						break;

					case 3:
						System.out.println("Enter acccount no");
						acctno = sc.nextInt();
						Bank acts = accts.get(acctno);

						if (acts == null)
							throw new BankingException("Invalid Account No!!!");

						System.out.println("Account details" + acts);
						break;

					}// endof Switch

				} catch (Exception e) {
					e.printStackTrace();
					e.getMessage();

				}

			} // endof while

		} catch (Exception e) {
			e.printStackTrace();
		} // end of catch

	}// end of main

}// endof class
