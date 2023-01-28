package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFileCopy {

	public static void main(String[] args) {
		System.out.println("enter file name and destination file name");
		try(Scanner sc=new Scanner(System.in);
				BufferedReader b = new BufferedReader(new FileReader(sc.nextLine()));
						PrintWriter p = new PrintWriter(new FileWriter(sc.nextLine(),true));)
		{
			String s = null;
			while((s=b.readLine())!=null)
			{
				System.out.println(s);
			}
			System.out.println("file copy done");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
