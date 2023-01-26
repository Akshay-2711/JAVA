package Tester;

import java.time.LocalDate;
import java.util.Scanner;

import com.app.banking.Bank;
import static utils.IOutils.*;

public class Restoreddetails {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the filename");
			String filename = sc.nextLine();
			System.out.println("Enter account details ");
			Bank b = new Bank(sc.nextInt(), sc.next(), sc.nextDouble(), validateType(sc.next()),
					LocalDate.parse(sc.next()));
			writeDetails(filename, b);
			System.out.println("Details added!!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}