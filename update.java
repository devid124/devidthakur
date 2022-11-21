import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class update {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root", "devid@124");
            String q="update table1 set tName=?,tCity=? where tId=?";
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter name");
            String name=br.readLine();
            System.out.println("enter city");
            String city=br.readLine();
            System.out.println("enter id");
            int id=Integer.parseInt(br.readLine());
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
            System.out.println("updated");
        }
            catch (Exception e) {
           System.out.println(e);
        }
    }
}
