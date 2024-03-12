import java.util.*;
package add;

public class Add
{
	Scanner sc = new Scanner(System.in);
	public Add()
	{
		int no1,no2;
		System.out.print("Enter Value 1 : ");
		no1 = sc.nextInt();
		System.out.print("Enter Value 2 : ");
		no2 = sc.nextInt();

		add = no1 + no2;

		System.out.println("Addition is : " + add);
	}
	
}