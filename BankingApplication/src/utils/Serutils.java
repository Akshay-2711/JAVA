package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.banking.Bank;

public class Serutils {

	public static void writeacts(String filename,Map<Integer, Bank> accounts) throws IOException
	{
		
		try(ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream(filename))){
			obj.writeObject(accounts);
		}
	}
	
	
}
