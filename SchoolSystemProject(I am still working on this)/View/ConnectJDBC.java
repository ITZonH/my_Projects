package View;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import model.UserCreateAccountDAO;

public class ConnectJDBC 
{
  private static final String URL ="jdbc:mysql://localhost:/schooldb";
  private final static String USERNAME = "root";
  private final static String password ="#Abobo2225";
   Connection connection =null;
  
  

  public ConnectJDBC()
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
  }

  public Connection getMyDBConnection() 
  {
    return connection;
    
  }

  public void closeConnection()
  {
    
    try 
      {
        if(connection !=null && !connection.isClosed())
          {
            connection.close();
            System.out.println("Connection Closed!");
          }
        else
          {
            System.out.println("Could not close");
          }
      }

    catch(SQLException e)
      {
        e.printStackTrace();
      }
  }
  public static void main(String[] args) {
    //new ConnectJDBC();
    new UserCreateAccountDAO();
  }
}

