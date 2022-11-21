
import java.io.InputStreamReader;
import java.sql.*;
import java.io.*;    
public class dynamicinput {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/youtube";
            String username="root";
            String password="devid@124";
            Connection con=DriverManager.getConnection(url,username,password);
            String q="insert into table1(tName,tCity) values (?,?)";
            PreparedStatement pstmt=con.prepareStatement(q);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter name");
            String name =br.readLine();
            System.out.println("enter city:");
            String city =br.readLine();
            pstmt.setString(1,name);
            pstmt.setString(2,city);
            pstmt.executeUpdate();
            System.out.println("inserted...");
            con.close();
          
        }
        catch(Exception e){
            System.out.println(e);
        }   
    }
}
