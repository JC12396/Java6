package GameZone;

import java.util.Scanner;

public class Quiz {
		
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int choice1;
		int choice2;
		int choice3;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int totalCount = 0;
		
		System.out.println("This will be a test with three Q's.");
		System.out.println("You will not be able to pass to the next Q's until you answer the previous one right!\nGood Luck!");
		do {
		System.out.println("Q1: A structure that allows repeaated execution of a block of statements is a ___________\n1 - cycle\n2 - loop\n3 - ring\n4 - band\n>>");
		choice1 = input.nextInt();
		if (choice1 == 1)
		{
			System.out.println("Sorry, incorrect.");
			count1 = count1 +1;
		}
		else if (choice1 == 2)
		{
			System.out.println("Correct!!!");
			count1 = count1 +1;
		}
		else if (choice1 == 3)
		{
			System.out.println("Sorry, incorrect.");
			count1 = count1 +1;
		}
		else if (choice1 == 4)
		{
			System.out.println("Sorry, incorrect.");
			count1 = count1 +1;
		}
		}while (choice1 != 2);
		System.out.println("It took you " + count1 +  " tries for Q1.");
		System.out.println("Time for the next question.");
		do {
		System.out.println("Q2: A loop that never ends is a(n) ___________ loop\n1 - iterative\n2 - infinite\n3 - structured\n4 - illegal\n>>");
		choice2 = input.nextInt();
		if (choice2 == 1)
		{
			System.out.println("Sorry, incorrect.");
			count2 = count2 +1;
		}
		else if (choice2 == 2)
		{
			System.out.println("Correct!!!");
			count2 = count2 +1;
		}
		else if (choice2 == 3)
		{
			System.out.println("Sorry, incorrect.");
			count2 = count2 +1;
		}
		else if (choice2 == 4)
		{
			System.out.println("Sorry, incorrect.");
			count2 = count2 +1;
		}
		}while (choice2 != 2);
		System.out.println("It took you " + count2 + " tries for Q2.");
		System.out.println("Time for the last question.");
		do {
		System.out.println("Q3: To construct a loop that works correctly, you should initialize a loop control ___________\n1 - variable\n2 - constant\n3 - structure\n4 - condition\n>>");
		choice3 = input.nextInt();
		if (choice3 == 1)
		{
			System.out.println("Sorry, incorrect.");
			count3 = count3 +1;
		}
		else if (choice3 == 2)
		{
			System.out.println("Correct!!!");
			count3 = count3 +1;
		}
		else if (choice3 == 3)
		{
			System.out.println("Sorry, incorrect.");
			count3 = count3 +1;
		}
		else if (choice3 == 4)
		{
			System.out.println("Sorry, incorrect.");
			count3 = count3 +1;
		}
		}while (choice3 != 2);
		totalCount = count1 + count2 + count3;
		System.out.println("It took you " + count3 + " tries for Q3.");
		System.out.println("Thank you for taking this quiz it took you " + totalCount + " total tries to complete the quiz.");



		
		
		
	}
		
}
