package model;
import java. sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import View.ConnectJDBC;

public class UserCreateAccountDAO
{
    
    public boolean  createUser(UserCreateAccount user)
    {
        final String QUERY = "INSERT INTO userlogin(FirstName, LastName, email,password) VALUES (?,?,?,?)";
        final ConnectJDBC db = new ConnectJDBC();
        
        
        try(Connection connection = db.getMyDBConnection(); PreparedStatement  statement = connection.prepareStatement(QUERY))
            {
               
                statement.setString(1,user.getFirstName());
                statement.setString(2, user.getLastName());
                statement.setString(3, user.getEmail());
                statement.setString(4, user.getPass());

                int i = statement.executeUpdate();
                if(i>0) 
                {
                    
                    System.out.println("Record added");
                    return true;
                }
                else
                    {
                        System.out.println("Could not add recored");
                        return false;
                    }
            }
        catch(SQLException E)
            {
                E.printStackTrace();
                return false;
            }
        finally
            {
                db.closeConnection();
            }
    
    }
}