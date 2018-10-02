package Excercises;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		int testAverage = 0;
		int testBest = 0;
		int testLow = 100;
		int count = 0;
		int total = 0;
		int testCount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("To exit this program type in 0");
		
		System.out.println("How many tests do you have to input? >> ");
		testCount = input.nextInt();
		
		for (int i = 0; i <= testCount; i++) {
			System.out.println("Please enter test score. >> ");
			choice = input.nextInt();
			
			if (choice > testBest)
			{
				testBest = choice;
				count = count + 1;
			}
			else if (choice < testLow)
			{
				testLow = choice;
				count = count + 1;
			}
			else if (choice > 100 || choice < 0 )
			{
				System.out.println("out of range");
				
			}
			total = total + choice;
			testAverage = total / count;
		}
		System.out.println("The best is " + testBest + "%, the lowest was " + testLow + "% and the average was " + testAverage + "%");
	
	}
	

}
