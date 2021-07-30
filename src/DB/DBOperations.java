package DB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBOperations {

    public static ResultSet Read(String query) throws SQLException {
        DB.DBConnection.Connect();
        Statement stmt = DBConnection.conn.createStatement();
        return stmt.executeQuery(query);
    }

    public static void Create(String query) throws SQLException{
        DBConnection.Connect();
        PreparedStatement stmt =  DBConnection.conn.prepareStatement(query);
        stmt.execute();
        DBConnection.conn.close();
    }
}