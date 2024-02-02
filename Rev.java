import java.util.*;
class Rev
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int temp = 0,rev = 0,rem = 0;
		System.out.println("Enter No:");
		int no = sc.nextInt();
		temp = no;

		while(temp > 0)
		{
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}

		System.out.println("Orignal Number Is : " + no);
		System.out.println("Reverse Number Is : " + rev);
	}
}

