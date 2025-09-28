package connectionTools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import model.UserCreateAccountDAO;

public class ConnectJDBC 
{
    private final Properties properties = new Properties();
    private Connection connection = null;

    public ConnectJDBC() 
    {
      loadProperties();
      connect();
    }

    private void loadProperties() 
    {
      try (FileInputStream file = new FileInputStream("db.properties")) 
        {
          properties.load(file);
        } 
      catch (IOException e) 
        {
          System.out.println("Could not load db.properties!");
          e.printStackTrace();
        }
    }

    private void connect() 
    {
        try 
          {
            final String url      = properties.getProperty("db.url");
            final String userName = properties.getProperty("db.userName");
            final String password = properties.getProperty("db.password");

            
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected");
         } 
        catch (SQLException e) 
        {
          System.out.println("Could Not Connect!");
          e.printStackTrace();
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
          if (connection != null && !connection.isClosed())
            {
              connection.close();
              System.out.println("Connection Closed!");
            }
        } 
      catch (SQLException e)
        {
          e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
      new UserCreateAccountDAO();
    }
}
