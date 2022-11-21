import java.sql.*;
public class practise2 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/youtube";
            String username="root";
            String password="devid@124";
            Connection con =DriverManager.getConnection(url,username,password);
            String q="create table table3(id int(20) primary key auto_increment, pic blob)";
            Statement stmt=con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("create table");
            con.close();

    }
    
    catch(Exception e){
        System.out.println(e);
    }
}
}