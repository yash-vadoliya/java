import java.util.*;

class Pelidrom
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");	
		int no = sc.nextInt();
		int temp = 0,rem = 0,rev = 0;
		temp = no;
		while(temp > 0)
		{
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if(no == rev)
		{
			System.out.println("Enter Number Is pelidrom.");
		}
		else
		{
			System.out.println("Enter Number Is Not pelidrom.");
		}
	}
}