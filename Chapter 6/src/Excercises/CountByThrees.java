package Excercises;

import java.util.Scanner;

public class CountByThrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		for (int i = 0; i<=300; i+= 3)
		{
			System.out.println("Count " + i);
			if (i % 30 == 0)
			{
				System.out.println();
			}
		}
		for (int i = 300; i >= 0;i-= 3 )
		{
			System.out.println("Count " + i);
			if (i % 30 == 0)
			{
				System.out.println();
			}
		}
	}

}
