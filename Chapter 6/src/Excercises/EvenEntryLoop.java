package Excercises;

import java.util.Scanner;

public class EvenEntryLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("To exit this program type in 999");
		
		do {
			System.out.println("Choose a number >> ");
			choice = input.nextInt();
			if (choice % 2 == 0)
			{
				System.out.println("Good Job");
			}
			else
			{
				System.out.println("ERROR 404");
			}
			
		}while(choice != 999);
		
	}

}
