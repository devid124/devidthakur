import java.sql.*;
public class showtable {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/youtube";
            String username="root";
            String password="devid@124";
            Connection con=DriverManager.getConnection(url,username,password);
            String q="select * from table1";
            Statement stmt=con.createStatement();
            ResultSet set=stmt.executeQuery(q);
            while(set.next()){
                int id=set.getInt(1);
                String name=set.getString(2);
                String city=set.getString(3);
                System.out.println(id + " : "+ name +" : " +city);
            }
           
          
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}
