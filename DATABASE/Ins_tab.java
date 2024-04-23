import java.sql.*;
import java.util.*;

public class Ins_tab {
    public static void main(String[] args) {
        try{
            // Class.forName("com.mysql.cj.jdbc.Driver");
            // String url = "jdbc.mysql://localhost:3306/Yash";
            // String unm = "root";
            // String pwd = "";
            // Connection con = DriverManager.getConnection(url,unm,pwd);

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Yash","root","");

            String q = "Insert into student(rollno,name,city) values(1,'yash','Junagadh')";

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
