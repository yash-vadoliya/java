package pack;
import java.util.*;

public class U_input
{
	Scanner sc = new Scanner(System.in);
	int sal;
	public U_input()
	{

		System.out.print("Enter Name:");
		String name = sc.nextLine();
		System.out.print("Enter Post:");
		String post = sc.nextLine();
		System.out.print("Enter City:");
		String city = sc.nextLine();
		System.out.print("Enter Mobile NO:");
		int mono = sc.nextInt();
		System.out.print("Enter Salary:");
		sal = sc.nextInt();

		System.out.println("-----------------------DISPLAY DATA-----------------------");
		System.out.println("NAME : "+name);
		System.out.println("POST : "+post);
		System.out.println("CITY : "+city);
		System.out.println("MONO : "+mono);
		System.out.println("SALARY : "+sal);
	}
}
