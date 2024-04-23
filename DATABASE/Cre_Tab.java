import java.sql.*;

public class Cre_Tab {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Yash","root","");

            String query = "create table student(rollno int,name varchar(255),city varchar(255))";

            Statement st = con.createStatement();
            st.executeUpdate(query);
            con.close();

        }
        catch(Exception e){
            System.err.println(e);
        }
    }
}
