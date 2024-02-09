// 4. Write a program that a Duck number is a number which has zeroes present in it, but there should be no zero present in the beginning of the number.

import java.util.*;

class Duck
{
	boolean duckno(int no)
	{
		while(no != 0)
		{
			if(no % 10 == 0)
				return true;
			no = no / 10;
		}
		return false;
	}
}

class Pro_4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	

		System.out.println("Enter Number :");
		int no= sc.nextInt();

		Duck d = new Duck();

		boolean res = d.duckno(no);

		if(res== true){
            System.out.println("Number is a duck number: "+ no);
        }
        else
        {
     		System.out.println("Number is not a duck number: "+ no);
		}
	}
}


