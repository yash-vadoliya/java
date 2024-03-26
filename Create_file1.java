	// 	  Stream
	// 	     |
	//   |------|-----|
	//   v            v	
	// Byte 		Character

import java.io.*;
class Create_file1
{
	public static void main(String[] args) 
	{
		File f = new File("F:\\yash\\java\\26-3\\Mca.txt");
		try
		{
			if(f.createNewFile())
			{
				System.out.println("File Is Created");
			}
			else
			{
				System.out.println("File Does Not Exist ");
			}
		}
		catch(IOException ie)
		{
			System.out.println(ie);
		}
		
	}
}