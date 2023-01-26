package utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import static com.app.banking.AccountType.*;

import com.app.banking.AccountType;
import com.app.banking.Bank;

import exception.BankingException;

public class BankUtils {
	public static final double MIN_BAL;
	static {
		MIN_BAL = 2000;
	}

	public static double validateBalance(double bal) throws BankingException {
		if (bal < MIN_BAL)
			throw new BankingException("Insufficient balance!!!!");
		return bal;
	}

	public static AccountType validateAccountType(String type) {
		return AccountType.valueOf(type.toUpperCase());
	}

	public static Map<Integer, Bank> populateBank() throws BankingException {

		Map<Integer, Bank> accounts = new HashMap<Integer, Bank>();

		accounts.put(101, new Bank(101, "Akshay", validateBalance(3000), SAVINGS, LocalDate.parse("2021-09-28")));
		accounts.put(98, new Bank(98, "Vijay", validateBalance(8000), DEMAT, LocalDate.parse("2019-05-14")));
		accounts.put(65, new Bank(65, "Akash", validateBalance(4000), SAVINGS, LocalDate.parse("2018-09-12")));
		accounts.put(27, new Bank(27, "Ramesh", validateBalance(2000), LOAN, LocalDate.parse("2018-08-25")));
		accounts.put(146, new Bank(146, "Prabhakar", validateBalance(6500), FD, LocalDate.parse("2019-07-22")));
		accounts.put(325, new Bank(325, "Gautami", validateBalance(7500), LOAN, LocalDate.parse("2022-03-11")));

		return accounts;

	}

}
