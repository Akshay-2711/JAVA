package accountdetails;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TransactionDetails {

	public static double sumOfDeposits() throws IOException {
	String [] arr= new String[4];
	String line = null;
	double sum=0;
	
	BufferedReader br = new BufferedReader(new FileReader("E:\\details.txt"));
	while((line=br.readLine())!=null)
	{
		arr=line.split(",");
		sum=sum+Double.parseDouble(arr[3]);
	}
	return sum;
	
	}//sumOfDeposits
	
	public static Double maxAmt() throws IOException,FileNotFoundException
	{
		double maxamt=0.0;
		String [] arr=new String[4];
		String line=null;
		BufferedReader br = new BufferedReader(new FileReader("E:\\details"));
		while((line=br.readLine())!=null)
		{
			arr=line.split(",");
			if(maxamt<Double.parseDouble(arr[3]))
			{
				maxamt=Double.parseDouble(arr[3]);
			}
			
		}
		return maxamt;
		
	}//maxAmt
	
	public static Double sumShopping() throws IOException
	{
		String arr[]=new String[4];
		double sum=0.0;
		BufferedReader br = new BufferedReader(new FileReader("E:\\details"));
		String line=null;
		while((line=br.readLine())!=null)
		{
			arr=line.split(",");
			if(arr[1]=="Shopping")
			{
				sum=sum+Double.parseDouble(arr[2]);
			}
		}
		return sum;
	}//sumShopping
		
		public static String maxWithdrawDate() throws IOException 
		{
			
			String date = null,line = null;
			String [] arr=new String[4];
			double max=0.0;
			BufferedReader br = new BufferedReader(new FileReader("E:\\details.txt"));
			while((line=br.readLine())!=null)
			{
				arr=line.split(",");
				if(max<Double.parseDouble(arr[2]))
				{
					max=Double.parseDouble(arr[2]);
				    date = arr[0];
				}
			}
			return date;
		}//maxWithdrawDate
	
	public static boolean writeTransaction(String line) throws IOException
	{
		PrintWriter pw=new PrintWriter(new FileWriter("E:\\details.txt"));
		//String line="02-02-2022,majja,300.0,0.0";
		pw.write(line);
		pw.close();
		return true;
		
				
	}//writeTransaction
}//class
















