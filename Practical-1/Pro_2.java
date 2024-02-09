// Write a Program a number is said to be Buzz Number if it ends with 7 or is divisible by 7.

import java.util.*;

class Pro_2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	

		System.out.println("Enter Number :");
		int no= sc.nextInt();

		if(no % 10 == 7 || no / 7 == 0)
		{
			System.out.println(no + " is Buzz Number.");
		}
		else
		{
			System.out.println(no + " is Not Buzz Number.");
		}
	}
}