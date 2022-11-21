import java.io.FileInputStream;
import java.sql.*;
import java.io.*;
public class image {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/youtube";
            String username="root";
            String password="devid@124";
            Connection con=DriverManager.getConnection(url,username,password);
            String q="insert into table3(pic) values(?)";
            PreparedStatement pstmt=con.prepareStatement(q);
            FileInputStream fis=new FileInputStream("ankit.jpg.jpg");
            pstmt.setBinaryStream(1,fis,fis.available());
            pstmt.executeUpdate();
            System.out.println("done....");
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
