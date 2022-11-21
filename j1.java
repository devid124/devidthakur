import java.sql.*;   
public class j1 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/youtube";
            String username="root";
            String password="devid@124";
            Connection con=DriverManager.getConnection(url,username,password); 
            if(con.isClosed()){
                System.out.println("connection is close");
            } 
            else{
                System.out.println("connection created");
            }

    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}
