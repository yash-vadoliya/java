import java.util.*;

class Res
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		String s_name[] = new String[5];
		int s_mark[] = new int[5];

		for(int i=0;i<5;i++)
		{
			System.out.print("Enter Subject Name : ");
			s_name[i] = sc.nextLine();
		}

		for(int i=0;i<5;i++)
		{
			System.out.print("Enter Marks for "+s_name[i] +" Is : ");
			s_mark[i] = sc.nextInt();
		}

		System.out.println("\n \t\t Result Is \n");
		System.out.println("\t\t ----------------\n");
		System.out.println("\t\tNo\tSubject\tMarks");
		for(int i=0;i<5;i++)
		{
			System.out.println("\t\t"+i+"\t"+s_name[i]+"\t"+s_mark[i]);			
		}
		System.out.println("\t\t------------------------");
	}
}