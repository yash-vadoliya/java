// Create a Package

package pack;
import java.util.*;

public class U_snm
{
	Scanner sc = new Scanner(System.in);
	String s_nm[] = new String[5];
	public U_snm()
	{
		for(int i=0;i<s_nm.length;i++)
		{
			System.out.print("Enter Subject Name : "+i);
			s_nm[i] = sc.nextLine();
		}
	}
}
