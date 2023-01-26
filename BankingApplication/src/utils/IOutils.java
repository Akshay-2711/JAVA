package utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

import com.app.banking.AccountType;
import com.app.banking.Bank;

public class IOutils {

	public static void writeDetails(String filename, Bank act) throws IOException {
		try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filename)))) {
			// String custname, double balance, AccountType act, LocalDate date

			dos.writeInt(act.getAcctno());
			dos.writeUTF(act.getCustname());
			dos.writeDouble(act.getBalance());
			dos.writeUTF(act.getAct().toString());
			dos.writeUTF(act.getDate().toString());

		}
	}

	public static Bank readDetails(String filename) throws FileNotFoundException, IOException {

		File f1 = new File(filename);
		if (f1.isFile() && f1.canRead()) {

			try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(f1)))) {

				return new Bank(in.readInt(), in.readUTF(), in.readDouble(), validateType(in.readUTF()),
						LocalDate.parse(in.readUTF()));
			}
		} else
			System.out.println("Invalid filename");
		return null;
	}

	public static AccountType validateType(String t) {
		return AccountType.valueOf(t.toUpperCase());
	}

}
