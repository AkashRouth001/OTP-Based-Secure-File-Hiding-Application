package dao;

import db.MyConnections;
import model.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// data acsses oporet = dao
public class UserDAO {
    public static boolean isExists(String email)throws SQLException {
        Connection connection = MyConnections.getConnection();
        PreparedStatement ps = connection.prepareStatement("select email from Users");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String e = rs.getString(1);
            if (e.equals(email)){
                return  true;
            }
        }
        return  false;
    }
   /* public static void saveUser( User user) throws SQLException{
        Connection connection = MyConnections.getConnection();
        PreparedStatement ps = connection.prepareStatement("insert into users values(default, ?, ?)");
        ps.setString(1, user.getName());
        ps.setString(2, user.getEmail());
        return ps.executeUpdate();
    }*/
   public static int saveUser(User user) throws SQLException {
       Connection connection = MyConnections.getConnection();
       PreparedStatement ps =connection.prepareStatement("insert into users values(default, ?, ?)");
       ps.setString(1, user.getName());
       ps.setString(2, user.getEmail());
       return ps.executeUpdate();
   }
}
