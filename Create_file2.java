// Create file using user input 
import java.io.*;
import java.util.*;
class First
{
	Scanner sc = new Scanner(System.in);
	First() throws IOException
	{
		System.out.println("Enter user File With Extetion : ");
		String file_c;
		file_c = sc.nextLine();
		File f = new File("F:\\yash\\java\\26-3\\"+file_c);
		if(f.createNewFile())
		{
			System.out.println("File Is Created");
		}
		else
		{
			System.out.println("File Does Not Exist ");
		}
	}
}
class Create_file2
{
	public static void main(String[] args)  throws IOException
	{
		First f = new First();
	}
}