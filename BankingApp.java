package Banking;
import java.util.*;

public class BankingApp {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		//create initial Accounts
		System.out.println("How many Number of cutomer do you want to input");
		int n=s.nextInt();
		BankDetails b[]=new BankDetails[n];
		for(int i=0;i<b.length;i++)
		{
			b[i]=new BankDetails();
			b[i].OpenAccount();
		}
		//Loop runs until number 5 is not pressed to exit
		
		int choice;
		do 
		{
			System.out.println("\n*****Banking System Application*****");
			System.out.println("1.Display all Account details \n2.Search by Account Number \n3.Deposit the Amount \n4.Withdraw the Amount \n5.Exit");
			System.out.println("Enter your Choice");
			choice=s.nextInt();
			switch (choice)
			{
			case 1:
				for (int i = 0; i < b.length; i++)
				{
					b[i].showAccount();
				}
					break;
			case 2:
				System.out.println("Enter account no. you want to search: ");
				String acNo=s.next();
				boolean found=false;
				for (int i = 0; i < b.length; i++) {
					found=b[i].search(acNo);
					if (found) {
						break;
					}
				}
				if (!found) {
                    System.out.println("Search failed! Account doesn't exist..!!");  
				}
				break;
			case 3:
				System.out.println("Enter Account No :");
				acNo=s.next();
				found=false;
				for (int i = 0; i < b.length; i++) {
					found =b[i].search(acNo);
				if (found) {
					b[i].deposit();
					break;	
				}
				}
				if (!found) {
					System.out.println("Search Failed! Account doesn't exit");
				}
				break;
			case 4:
				System.out.println("Enter AccountNo :");
				acNo=s.next();
				found=false;
				for (int i = 0; i < b.length; i++) {
					found=b[i].search(acNo);
					if (found) {
						b[i].withdrawal();
						break;
					}
				}
			}
			
		} 
		while (choice!=5);
		
	}  

}
