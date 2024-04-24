import java.sql.*;
import java.util.*;


class Connection_db
{
	Connection_db()
	{
		try
		{
			// Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			if(con.isClosed())
			{
				System.out.println("Please check Connection...");
			}
			else
			{
				System.out.println("Database Connected Successfully..");
			}
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}

class Cre_tab 
{
	Cre_tab()
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			String create_table = "create table Student(rollno int,name varchar(50),stram varchar(50))";

			Statement st = con.createStatement();
			st.executeUpdate(create_table);
			con.close(); 
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		
	}
}

class Crud
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("================MANU================");
		System.out.println("1. Connection With Database");
		System.out.println("2. Create Table");
		System.out.println("3. Insert Record");
		System.out.println("4. Display Data");
		System.out.println("5. Exit");

		System.out.print("Enter Your Choice : ");
		int choice = sc.nextInt();

		if(choice == 1)
		{
			Connection_db c = new Connection_db();
		}
		if(choice == 2)
		{
			Cre_tab tab = new Cre_tab();
		}
		
	}
}