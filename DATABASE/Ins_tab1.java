import java.sql.*;
import java.util.*;

class Ins_tab1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Yash","root","");

			System.out.print("Enter Roll No : ");
			int rno = sc.nextInt();

			System.out.print("Enter Name : ");
			String nm = sc.nextLine();

			System.out.print("Enter City : ");
			String city = sc.nextLine();

            String q = "Insert into student(rollno,name,city) values('"+rno+"','"+nm+"','"+city+"')";

            PreparedStatement ps = con.prepareStatement(q);
            ps.executeUpdate();

            System.out.println("Your Data is Inserted...");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
	}
}