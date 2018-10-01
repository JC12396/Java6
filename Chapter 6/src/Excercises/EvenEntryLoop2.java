package Excercises;

import java.util.Scanner;

public class EvenEntryLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice = 0;
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("To exit this program type in 999");
		
		while(choice != 999) {
	
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
			
		
		}
	}

}
