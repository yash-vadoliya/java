// 1. CRATE A FILE
// 2. GET NAME
// 3. ABSOLUTE PATH
// 4. LENGTH
// 5. DELETE
// 6. EXIT

import java.util.*;
import java.io.*;

class First
{
	Scanner sc = new Scanner(System.in);
	First() 
	{
		while(true) 
		{
			System.out.println(" 1. Create a New File");
			System.out.println("2. File Name");
			System.out.println("3. File Path");
			System.out.println("4. File Length");
			System.out.println("5. File Remove");
			System.out.println("6. Exit");
			
			int a;
			System.out.print("Enter Choice : ");
			a = sc.nextInt();
			// sc.nextLine();

			
			switch(a)
			{
				case 1:
					Filecreate();
					break;
			case 2 :
				Filename();
				break;
			case 3 :
				Filepath();
				break;
			case 4 :
				Filelength();
				break;
			case 5 :
				Fileremove();
				break;
			case 6 :
				System.exit(0);
				break;
			default:
				System.out.println("Please Enter 1 to 6 ..");
			}
		}
	}
		// String f_pa = "F:\\yash\\java\\26-3\\";
		// File file = new File(f_pa);

		 void Filecreate()
		{
			System.out.println("Enter File Name :");
			String f_nm = sc.nextLine();
			
			File f = new File(f_nm);
			try
			{
				if(f.createNewFile())
				{
					System.out.println("file created");
				}
				else
				{
					System.out.println("file exists");
				}
			
			}
			catch(IOException e)
			{
				System.out.println("error");	
			}
		}
		
		void Filename()
		{

		}
		void Filelength()
		{

		}
		void Filepath()
		{

		}
		void Fileremove()
		{

		}
	}


class Menu
{
	public static void main(String[] args) 
	{
		First f1 = new First();	
	}
}