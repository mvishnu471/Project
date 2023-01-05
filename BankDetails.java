package Banking;
import java.util.*;
public class BankDetails {
	
	private String accNo;
	private String Name;
	private String AccType;
	private long balance;
	static Scanner s=new Scanner(System.in);
	
	public void OpenAccount()
	{
		System.out.println("Enter Account No : ");
		accNo=s.next();
		System.out.println("Enter Name :");
		Name=s.next();
		System.out.println("Enter Account Type :");
		AccType=s.next();
		System.out.println("Enter Balance : ");
		balance=s.nextLong();
		
	}

	//Method to display ACCOUNT details
	public void showAccount()
	{
		System.out.println("Name of Account Holder :"+Name);
		System.out.println("Account No :"+accNo);
		System.out.println("Account Type :"+AccType);
		System.out.println("Balance :"+balance);
	}
	public void deposit()
	{
		long  amount;
		System.out.println("Enter the Amount You want to Deposit :");
		amount=s.nextLong();
		balance =balance+amount;
	}
	public void withdrawal()
	{
		long amount;
		System.out.println("Enter the Amount you want to Withdrawal :");
		amount=s.nextLong();
		if (balance>=amount) 
		{
			balance=balance-amount;
			System.out.println("Balance after Withdrwal :"+balance);
			
		} 
		else 
		{
			System.out.println("Your balance is less than "+amount+"\tTransaction Failed");
		}		
	}
		//method to search an Account Number
	public boolean search(String acNo)
	{
		if (accNo.equals(acNo)) 
		{
			showAccount();
			return true;
		} 
		return false;
	}
}

