import java.sql.*;

import com.mysql.cj.Query;
public class createtable {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/youtube";
            String username="root";
            String password="devid@124";
            Connection con=DriverManager.getConnection(url,username,password);
            String q="create table table1(tId int(20) primary key auto_increment, tName varchar(100), tCity varchar(50))";
            Statement stmt=con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("create table in database");
            con.close();
          
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
