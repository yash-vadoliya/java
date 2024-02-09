// Write a program that takes three numbers and checks and then prints the greatest number

import java.util.*;

class Pro_3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n1, n2, n3;

		System.out.print("Enter Number 1 :");
		n1 = sc.nextInt();
		System.out.print("Enter Number 2 :");
		n2 = sc.nextInt();
		System.out.print("Enter Number 3 :");
		n3 = sc.nextInt();

		if(n1 > n2 && n1 > n2)
		{
			System.out.println(n1+" Number 1 Is Biggest..");
		}
		else if(n2 > n1 && n2 > n3)
		{
			System.out.println(n2+ " Number 2 Is Biggest..");
		}
		else
		{
			System.out.println(n3+ "Number 3 Is Biggest..");
		}

	}
}