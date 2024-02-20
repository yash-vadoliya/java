import java.util.*;

class Arr
{
	Scanner sc = new Scanner(System.in);
	int[] a = new int[10];
	Arr()
	{
		
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter Value Of A["+i+"]:");
			a[i] = sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			System.out.println("Value Of A["+i+"]:"+a[i]);
		}
		
	}
}

class O_E extends Arr
{
	O_E()
	{
		for(int i=0;i<10;i++)
		{
			if(a[i] % 2 == 0)
				System.out.println(a[i]+" Number Is Even ");
			else
				System.out.println(a[i]+" Number Is Odd");
		}
	}
}

class Pro2
{
	public static void main(String[] args) 
	{		
		O_E a = new O_E();
	}
}