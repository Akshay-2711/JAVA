package com.app.banking;

import java.io.IOException;
import java.util.Scanner;

import exception.BankingException;

import static utils.Serutils.*;
import static utils.BankUtils.populateBank;

public class SerializationTest {

	public static void main(String[] args) {
		
		
		try(Scanner sc=new Scanner(System.in))
		{
		System.out.println("Enter the filename");
		writeacts(sc.nextLine(),populateBank());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
