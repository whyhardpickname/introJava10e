import java.util.*;

public class Exercise10_07
{
	public static void main(String[] args)
	{
		ATM atm = new ATM();
		atm.run();
	}
}

class ATM
{
	private Account[] accounts = new Account[10];
	
	public ATM()
	{
		for (int i = 0; i < accounts.length; i++)
		{
			accounts[i] = new Account(i, 100);
		}
	}
	
	public boolean isId(int id)
	{
		if (id >= 0 && id < accounts.length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isChoice(int choice)
	{
		if (choice >= 1 && choice <= 4)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	public void run()
	{
		while (true)
		{
			System.out.print("Enter an id: ");
			Scanner inId = new Scanner(System.in);
			int id = inId.nextInt();
			while (!isId(id))
			{
				System.out.print("Enter an id: ");
				id = inId.nextInt();
			}
			
			printMainMenu();
			
			while(true)
			{
				System.out.print("Enter a choice ");
				Scanner inChoice = new Scanner(System.in);
				int choice = inChoice.nextInt();
				while (!isChoice(choice))
				{
					System.out.print("Enter a choice ");
					choice = inChoice.nextInt();
				}
				
				if (choice == 1)
				{
					checkBalance(id);
				}
				else if (choice == 2)
				{
					withdraw(id);
				}
				else if (choice == 3)
				{
					deposit(id);
				}
				else if (choice == 4)
				{
					break;
				}
			}
		}
	}
	
	public void printMainMenu()
	{
		System.out.println("Main menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
	}
	
	public void checkBalance(int i)
	{
		System.out.println("the balance is " + accounts[i].getBalance());
	}
	
	public void withdraw(int i)
	{
		System.out.print("Enter an amount to whithdraw: ");
		Scanner in = new Scanner(System.in);
		double amount = in.nextDouble();
		if (amount <= accounts[i].getBalance())
		{
			accounts[i].withDraw(amount);
		}
		else
		{
			System.out.println("The balance is not enouth.");
		}
		
	}
	
	public void deposit(int i)
	{
		System.out.print("Enter an amount to deposit: ");
		Scanner in = new Scanner(System.in);
		double amount = in.nextDouble();
		accounts[i].deposit(amount);
	}
	
}