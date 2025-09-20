import java.util.*;
import java.lang.*;
import java.io.*;

class BankAccount{
    private String accountNumber;
    private int balance;
    public BankAccount(String accountNumber,int balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public int getBalance(){
        return balance;
    }
    public void deposit(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited = "+ amount);
        }else{
            System.out.println("Invalid Deposit Amount!");
        }
    }
    public void withdraw(int amount){
        if(amount> 0 && amount<=balance){
            balance-=amount;
            System.out.println("withdraw amount = " + amount);
        }else{
            System.out.println("Invalid withdraw amount!");
        }
    }
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BankAccount b=new BankAccount("50261321128",400000);
		String accountNumber=b.getAccountNumber();
		int balance=b.getBalance();
		System.out.println(balance);
		b.deposit(400000);
		int newbalance=b.getBalance();
		System.out.println(accountNumber);
		System.out.println(newbalance);

	}
}
