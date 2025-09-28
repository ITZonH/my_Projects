package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import View.ConnectJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
public class UserLogInDAO
{
    UserLogInDAO()
    {
        final ConnectJDBC DB = new ConnectJDBC();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;

        connection = DB. getMyDBConnection();
        try
            {
                statement = connection.prepareStatement("SELECT * FROM UsersManager");
                result = statement.executeQuery();
            }
        catch(SQLException e)
            {
                e.printStackTrace();
            }
        finally
            {
                DB.closeConnection();
            }
    }

}