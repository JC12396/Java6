package practice;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		int lose = 0;
		int win = 0;
		int tie = 0;
		int again;
		
		Scanner input  = new Scanner(System.in);
		
		do {
			int random = 1 + (int)(Math.random() * 3);
			
		System.out.println("1 - Rock\n2 - Paper\n3 - Scissors");
		choice = input.nextInt();
		
		if (choice == random)
		{
			System.out.println("You tied!");
			tie++;
			
		}
		else if (choice == 1 && random == 2)
		{
			System.out.println("You lost!");
			lose++;
		}
		else if (choice == 1 && random == 3)
		{
			System.out.println("You Won!");
			win++;
		}
		else if (choice == 2 && random == 1)
		{
			System.out.println("You Won!");
			win++;
		}
		else if (choice == 2 && random == 3)
		{
			System.out.println("You lost!");
			lose++;
		}
		else if (choice == 3 && random == 2)
		{
			System.out.println("You Won!");
			win++;
		}
		else if (choice == 3 && random == 1)
		{
			System.out.println("You Lost!");
			lose++;
		}
		else
		{
			System.out.println("INVALID");
		}
		System.out.println("Wins: " + win + " Losses: " + lose + " Ties: " + tie);
		System.out.println("Again?\n1- Yes\n2 - No");
		again = input.nextInt();
		
		}while(again != 2);
		
	}

	}

