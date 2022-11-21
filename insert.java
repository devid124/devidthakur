import java.sql.*;
public class insert {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/youtube";
            String username="root";
            String password="devid@124";
            Connection con=DriverManager.getConnection(url,username,password);
            String q="insert into table1(tName,tCity) values (?,?)";
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setString(1,"devid");
            pstmt.setString(2,"hathras");
            pstmt.executeUpdate();
            System.out.println("inserted...");
            con.close();
          
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
