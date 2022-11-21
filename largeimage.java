import java.io.File;
import java.io.FileInputStream;
import java.sql.*;

import javax.swing.JFileChooser;
public class largeimage {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/youtube";
            String username="root";
            String password="devid@124";
            Connection con=DriverManager.getConnection(url,username,password);
            String q="insert into table3(pic) values(?)";
            PreparedStatement pstmt=con.prepareStatement(q);
            JFileChooser jfc=new JFileChooser();
            jfc.showOpenDialog(null);
            File file=jfc.getSelectedFile();
            FileInputStream fis=new FileInputStream(file);
            pstmt.setBinaryStream(1,fis,fis.available());
            pstmt.executeUpdate();
            System.out.println("success");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
