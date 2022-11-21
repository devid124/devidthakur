import java.sql.*;
public class practise1 {
    public static void main(String[] args) {
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/youtube";
            String username="root";
            String password="devid@124";
            Connection con =DriverManager.getConnection(url,username,password);
            if(con.isClosed()){
                System.out.println("close");
            }
            else{
                System.out.println("create");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
