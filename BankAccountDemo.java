package code;
import java.util.Scanner;
class BankAccount{
private String accountNumber;
private String accountName;
private double balance;
private double interest;
private double duductFees;
private int transaction;
public BankAccount(String accNumber,String accName){
	accountNumber=accNumber;
	accountName=accName;
	balance=0;
	interest=0.1;
	duductFees=0.5;
	transaction=3;
	
}
public String getAccountName(){
	System.out.println("enter your account name:");
	return accountName;
}

public String getAccountNumber(){
	System.out.println("enter your account no:");
	return accountNumber;
}

public double getBalance(){
	
	return balance;
	
}

public boolean deposit(double amount){
	if(amount>0){
		balance=balance + amount;
		
		return true;
	}else{
		System.out.println("invalid");
		return false;
	}
}
public boolean withdraw(double amount){
	if(amount>balance){
		System.out.println("there is no amount");
		return false;
	}else{
		balance=balance-amount;
		System.out.println("your avalable balance is:" +balance);
		return true;
	}
}

public boolean interest(double amount){
	if(amount>0){
		interest=interest * amount;
		System.out.println("your total interest and balance is:"+interest);
		return true;
		
	}else{
		System.out.println("invalid amount");
		return false;
	}
}
public boolean duductFees(double amount){
	if(transaction>3){
		duductFees=getBalance()-amount;
		System.out.println(duductFees);
		return true;
	}else{
		
		balance=balance+amount;
		return false;
	}
}

}

public class BankAccountDemo {
	 public static void main(String[] args) {
	 BankAccount absherzad = new BankAccount("20120", "Abdul Rahman Sherzad");
	 absherzad.deposit(500);
	 absherzad.withdraw(200);
	 absherzad.deposit(700);
	
	 
	 System.out.println("current Balance is: " + absherzad.getBalance()); // 2000 
	 
	 absherzad.interest( absherzad.getBalance());
	 System.out.println("duductFees:" +absherzad.getBalance());
	
	 }
	}
