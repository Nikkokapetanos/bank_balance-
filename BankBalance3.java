// chapter 6  example 5/30/2023

import java.util.Scanner;

public class BankBalance3 
{
	public static void main(String[] args) 
	{
		// variables and constants 
		double initialBalance;
		double balance;
		int year;
		double interest;
		final double LOW = 0.02;
		final double HIGH = 0.05;
		final double INCREMENT =0.01;
		final int MAX_YEAR = 4;
		Scanner keyboard = new Scanner(System.in);

		// input phase
		System.out.print("Please enter initial bank balance >");
		initialBalance = keyboard.nextDouble();
		keyboard.nextLine();

		// processing and output phases
		for(interest = LOW; interest <= HIGH; interest += INCREMENT)
		{
			balance = initialBalance;
			System.out.println("\nWith an initial balance of $" + balance + " at an interest rate of " + interest + ":");
			for(year = 1; year <= MAX_YEAR; ++year)
			{
				balance = balance + (balance * interest);
				System.out.println("After year " + year + " the balance is $" + balance);
			} // end of inner for loop
		} // end of outer for loop

		// final sign-off statement  after the looping is done
		System.out.println("Have a great day!");
	}
}