import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC 
{
  private static final String URL ="jdbc:mysql://localhost:/mydb";
  private final static String USERNAME = "root";
  private final static String password ="#Abobo2225";
  Connection connection =null;
  
  

  public ConnectJDBC()
  {
    getMyDBConnection();
  }

  private void getMyDBConnection() 
  {
    try
      {
         connection = DriverManager.getConnection(URL, USERNAME, password);
         
         System.out.println("Connected");
      }
    catch(SQLException e)
      {
         System.out.println("Could Not Connect!");
      } 
      finally
        {
          try
            {
              connection.close();
            }
          catch(Exception e)
            {
              
              e.printStackTrace();
              
            }
        }
    
  }
  public static void main(String[] args) {
    new ConnectJDBC();
  }
}

