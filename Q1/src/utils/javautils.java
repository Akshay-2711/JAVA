package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class javautils {

	public static double sumofdeposit() throws IllegalArgumentException, IOException
	{
		try(BufferedReader br= new BufferedReader(new FileReader("C:\\Users\\Smart\\Desktop\\javaappl.txt"))){
				
				String str=null;
				double deposit=0;
				String arr[]=new String[4];
				
				while((str=br.readLine())!=null)
				{
					arr=str.split(",");
					deposit+=Double.parseDouble(arr[3]);
				}
				return deposit;
		}
				
	}
	public static double Maxdeposit() throws IllegalArgumentException, IOException
		{
			try(BufferedReader br= new BufferedReader(new FileReader("C:\\Users\\Smart\\Desktop\\javaappl.txt"))){
					
					String str=null;
					double deposit=0;
					String arr[]=new String[4];
					
					while((str=br.readLine())!=null)
					{
						arr=str.split(",");
						if(deposit<Double.parseDouble(arr[3]))
						{
							deposit=Double.parseDouble(arr[3]);
						}
						
					}
					return deposit;
			}	
	}
	public static double Expenses() throws IllegalArgumentException, IOException
	{
		try(BufferedReader br= new BufferedReader(new FileReader("C:\\Users\\Smart\\Desktop\\javaappl.txt"))){
				
				String str=null;
				double withdraw=0;
			
				String arr[]=new String[4];
				String s="Shopping";
				
				while((str=br.readLine())!=null)
				{
					arr=str.split(",");
					
					if(s.equals(arr[1]))
					{
						withdraw=withdraw+ Double.parseDouble(arr[2]);
					}
					
				}
				return withdraw;
		}	
}
	public static String Maxamt() throws IllegalArgumentException, IOException
	{
		try(BufferedReader br= new BufferedReader(new FileReader("C:\\Users\\Smart\\Desktop\\javaappl.txt"))){
				
				String str=null;
				double withdraw=0;
				String arr[]=new String[4];
				String date=null;
				while((str=br.readLine())!=null)
				{
					arr=str.split(",");
					if(withdraw<Double.parseDouble(arr[2]))
					{
						withdraw=Double.parseDouble(arr[2]);
						date=arr[0];
					}
					
				}
				return date;
		}	
}
	
}
