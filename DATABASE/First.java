import java.util.*;
import java.sql.*;

class Con_db
{
	Scanner sc = new Scanner(System.in);
	String url = "jdbc:mysql://localhost:3306/mca_111";
	String unm = "root";
	String pass = "";
	Connection con;
	Con_db()
	{
		try
		{
			// Class.forName("com.mysql.cj.jdbc.Driver");
			// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca_111","root","");
			con = DriverManager.getConnection(url,unm,pass);
			System.out.println(con);			
			if(con.isClosed())
			{
				System.out.println("Please, Check Connection...");
			}
			else
			{
				System.out.println("Database Connect Successfully..");
			}
			con.close();
		}
		catch(Exception e)
		{
			// System.out.println(e);
		}
		

	}
}

class Crt_Tab extends Con_db
{
	Crt_Tab()
	{
		try
		{
			con = DriverManager.getConnection(url,unm,pass);
			String crt_table = "create table Stud(rollno int,name varchar(50))";

			Statement st = con.createStatement();
			st.executeUpdate(crt_table);
			con.close();
			System.out.println("Table Create Your Fild is Rollno And Name");
		}
		catch(SQLException se)
		{
			System.out.println(se);
		}

	}
}

class Ins_tab extends Con_db
{
	Ins_tab()
	{
		try
		{
			con = DriverManager.getConnection(url,unm,pass);

			String ins_tab = "Insert into Stud(rollno,name) values(1,'yash')";

			Statement st = con.createStatement();
			st.executeUpdate(ins_tab);
			System.out.println("-------------------------------");
			System.out.println("Data Insert Successfully..");
			System.out.println("-------------------------------");
			con.close();
		}
		catch(SQLException se)
		{
			System.out.println(se);
		}
	}
}

class Upd_tab extends Con_db
{
	Upd_tab()
	{
		try
		{
			con = DriverManager.getConnection(url,unm,pass);
			String upd_tab = "update Stud set name='yash vadoliya' where rollno=1";

			Statement st = con.createStatement();
			st.executeUpdate(upd_tab);
			System.out.println("-------------------------------");
			System.out.println("Data Update Successfully..");
			System.out.println("-------------------------------");
			con.close();
		}
		catch(SQLException se)
		{
			System.out.println(se);
		}
	}
}

class Del_tab extends Con_db
{
	Del_tab()
	{
		try
		{
			con = DriverManager.getConnection(url,unm,pass);
			String del_tab = "delete from Stud where rollno=1";

			Statement st = con.createStatement();
			st.executeUpdate(del_tab);
			System.out.println("-------------------------------");
			System.out.println("Data Delete Successfully..");
			System.out.println("-------------------------------");
			con.close();
		}
		catch(SQLException se)
		{
			System.out.println(se);
		}
	}
}

class Disp_tab extends Con_db
{
	Disp_tab()
	{
		try
		{
			con = DriverManager.getConnection(url,unm,pass);
			Statement st = con.createStatement();
			String disp_tab = "select * from Stud";
			ResultSet rs = st.executeQuery(disp_tab);
			System.out.println("-------------------------------");	
			System.out.println("\tRollNo\tName");
			System.out.println("-------------------------------");
			while(rs.next())
			{
				System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2));
			}
			System.out.println("-------------------------------");			
			con.close();
		}
		catch(SQLException se)
		{
			System.out.println(se);
		}
	}
}

class First
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("=================================");
			System.out.println("1. Connect Database");
			System.out.println("2. Create Table");
			System.out.println("3. Insert Record");
			System.out.println("4. Update Record");
			System.out.println("5. Delete Record");
			System.out.println("6. Show Data");
			System.out.println("7. Exit");	
			System.out.println("=================================");

			System.out.print("Enter Your Choice : ");
			int choice = sc.nextInt();

			switch(choice)
			{
				case 1 : 
					// System.out.println("Connect Database");
					Con_db c_db = new Con_db();
					break;
				case 2 :
					Crt_Tab c_tb = new Crt_Tab();
					break;
				case 3 :
					Ins_tab i_tb = new Ins_tab();
					break;
				case 4 :
					Upd_tab u_tb = new Upd_tab();
					break;
				case 5 :
					Del_tab de_tb = new Del_tab();
					break;
				case 6 :
					Disp_tab d_tb = new Disp_tab();
					break;
				case 7 :
					System.exit(0);
					break;
				default :
					System.out.println("Enter 1 to 7 to perform database");
					break;
			}
		}


		
	}
}