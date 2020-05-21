package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		String holder;
		double balance, deposit, withdraw;
		char initialDeposit;
		Account account;
		
		System.out.print("Enter account number: ");
		number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		initialDeposit = sc.next().charAt(0);
		
		if (initialDeposit =='y') {
			System.out.print("Enter initial deposit value: ");
			balance = sc.nextDouble();
			account = new Account(number, holder, balance);
		} else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
		
	}

}
