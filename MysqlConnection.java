import java.sql.*;

public class MysqlConnection {

public static void main(String[] args) {
    // TODO Auto-generated method stub
    try
    {  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/leaner","root","root");  

        Statement stmt = con.createStatement();  
        // ResultSet rs=stmt.executeQuery("select * from Employee");  
        // while(r/.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
        con.close();
    }

    catch(Exception e)
    {
        System.out.println(e);
    }

        }  

}