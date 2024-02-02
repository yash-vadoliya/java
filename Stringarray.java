import java.util.*;

class Stringarray
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		String s_name[] = new String[5];

		for(int i=0;i<5;i++)
		{
			System.out.print("Enter Name : ");
			s_name[i] = sc.nextLine();
		}

		for(int i=0;i<5;i++)
		{
			System.out.println("Name Is -> "+s_name[i]);
		}
	}
}