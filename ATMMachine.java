package corejavaminiproject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMMachine {
	
	private static double balance;
	static Scanner sc = new Scanner(System.in);
	
	//View Balance Method
	public static void viewBalance() {
		System.out.println("Current Balance in the Account is: "+balance);
		System.out.println("------------------------------------");
	}
	
	//withDraw Amount Balance
	public static void withDrawAmount() {
		
		double withDraw= 0.0;
		
		try {
		System.out.println("Enter Amount to WithDraw: ");
		withDraw = sc.nextDouble();
		if(balance>=withDraw) {
			balance = balance - withDraw;
			System.out.println("Debited Amount: "+withDraw);
			System.out.println("Current Balance in the Account is: "+balance);
		}
		else {
			System.out.println("<InSufficient Balance in the Account>");
			
		}
		}catch(InputMismatchException e) {
			System.out.println("<InCorrect Input Format>");
			sc.next();
		}
		System.out.println("------------------------------------");
		
	}
	
	//Deposit Amount
		public static void depositAmount() {
			double deposit= 0.0;
			
			try {
			System.out.println("Enter Amount to Deposit: ");
			deposit = sc.nextDouble();
			balance = balance + deposit;
			System.out.println("Credited Amount: "+deposit);
			System.out.println("Current Balance in the Account is: "+balance);
			}catch(InputMismatchException e) {
				System.out.println("<InCorrect Input Format>");
				sc.next();
			}
			System.out.println("------------------------------------");
		}

	public static void main(String[] args) {
		
		String cardNo = "1234";
		String pinNo = "1234";
		boolean condition = true;
		
		System.out.println("------------------------------------");
		System.out.println("----- Welcome To ATM Machine!! -----");
		System.out.println("------------------------------------");
		//Card Number Validation
		while(condition) {
			System.out.println("Enter Card Number: ");
			String cardNumber = sc.next();
			if(cardNo.equals(cardNumber))
				condition=false;
			else
			System.out.println("<InCorrect Card Number> Please Enter Again!!");
		}
		
		//Pin Number Validation
		condition = true;
		while(condition) {
			System.out.println("Enter Pin Number: ");
			String pinNumber = sc.next();
			if(pinNo.equals(pinNumber))
				condition=false;
			else
			System.out.println("<InCorrect Pin Number> Please Enter Again!!");
		}
		
		System.out.println("------------------------------------");
		System.out.println("Operations\n1. Check Current Balance\n2. WithDraw Amount\n3. Deposit Amount\n4. Exit");
		System.out.println("------------------------------------");
		
		//Operations
		while(true) {
			
			System.out.println("Enter Choice: ");
			String ch = sc.next();
			switch(ch) {
			case "1": viewBalance();
				break;
			case "2": withDrawAmount();
				break;
			case "3": depositAmount();
				break;
			case "4": 
				System.out.println("Thank you for using the ATM Machine!!");
				System.out.println("------------------------------------");
				System.exit(0);
			default : System.out.println("<InCorrect Choice> Please Enter Again!!");
			System.out.println("------------------------------------");
			}
			
		}
	}

}
