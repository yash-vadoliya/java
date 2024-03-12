package pack;
import pack.*;
public class U_marks
{
	U_snm u = new U_snm();
	int marks[] = new int[5];
	public U_marks()
	{
		for (int i=0;i<marks.length;i++) 
		{
			System.out.print("Enter "+u.s_nm[i]+" Marks : ");
			marks[i] = u.sc.nextInt();
		}
	}
}