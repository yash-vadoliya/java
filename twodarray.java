import java.util.*;

class twodarray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[][] mark = new int[3][2];

		for(int i=0;i<3;i++)
		{
			System.out.println("\t Roll Number = "+i);
			for (int j=0;j<2;j++) 
			{
				System.out.println("Enter Marks =>"+j+":");	
				mark[i][j] = sc.nextInt();
			}
		}

		System.out.println("\n\nDisplay Array");

		for(int i=0;i<3;i++)
		{
			System.out.println("\t Roll Number = "+i);
			for (int j=0;j<2;j++) 
			{
				System.out.println("Marks =>"+j+":"+mark[i][j]);	
			}
		}

	}
}