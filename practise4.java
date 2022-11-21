import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class practise4 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/youtube";
            String username="root";
            String password="devid@124";
            Connection con =DriverManager.getConnection(url,username,password);
            String q="insert into table2(name,gender,city) values(?,?,?)";
            PreparedStatement pstmt=con.prepareStatement(q);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter name");
            String name=br.readLine();
            System.out.println("enter gender");
            String gender=br.readLine();
            System.out.println("enter city");
            String city=br.readLine();
            pstmt.setString(1,name);
            pstmt.setString(2,gender);
            pstmt.setString(3,city);
            pstmt.executeUpdate();
            System.out.println("inserted");
            con.close();
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}
