package com.app.banking;

import java.io.Serializable;
import java.time.LocalDate;

public class Bank implements Serializable
{
	private int acctno;
	private String custname;
	private double balance;
	private AccountType act;
	private LocalDate date;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int acctno, String custname, double balance, AccountType act, LocalDate date) {
		super();
		this.acctno = acctno;
		this.custname = custname;
		this.balance = balance;
		this.act = act;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Bank [acctno=" + acctno + ", custname=" + custname + ", balance=" + balance + ", act=" + act + ", date="
				+ date + "]";
	}
	
	public void deposit(double bal)
	{
		this.balance +=bal;
	}

	public void withdraw(double bal)
	{
		
		this.balance -=bal;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public AccountType getAct() {
		return act;
	}
	public void setAct(AccountType act) {
		this.act = act;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getAcctno() {
		return acctno;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
