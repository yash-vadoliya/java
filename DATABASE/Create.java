import java.sql.*;

public class Create
{
    public static void main(String[] args) {
        try{

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Yash", "root", "");
            if(con.isClosed())
            {
                System.err.println("Database Not Connected Successfully...");
            }
            else{
                System.err.println("Database Connected Successfully...");
            }
            con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}