package pack;
import pack.*;
public class Dis
{
	U_marks um = new U_marks();
	public void display()
	{
		int k=1,t=0,per=0;
		for(int i=0;i<um.marks.length;i++)
		{
			System.out.println(k +" -> "+um.u.s_nm[i]+" = "+ um.marks[i]);
			t = t + um.marks[i];
			k++;
		}
		per = t / um.marks.length;
		System.out.println("Total : "+ t);
		System.out.println("Percentage : "+per+ "%");
	}
}