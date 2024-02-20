import java.util.*;
import java.lang.*;

class First
{
	Scanner sc = new Scanner(System.in);
	int no,sqr,s_r,temp,count = 0;
	First()
	{
		System.out.println("Enter Number ->");
		no = sc.nextInt();
	}

	void Pro()
	{
		temp = no;
		sqr = temp * temp;

		while(temp > 0)
		{
			temp = temp / 10;
			count++;
		}
		s_r = sqr % (int) Math.pow(10,count);

		if(s_r == no)
		{
			System.out.println("This Number is Automorphic => "+no);
		}
		else
		{
			System.out.println("This Number is Not Automorphic => "+no);
		}
	}
}

class Auto
{
	public static void main(String[] args) 
	{
		First f = new First();
		f.Pro();
	}
}
