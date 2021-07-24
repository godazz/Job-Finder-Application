package DB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBOperations {

    public static ResultSet Read(String query) throws SQLException {
        DB.DBConnection.Connect();
        Statement stmt = DBConnection.conn.createStatement();
        return stmt.executeQuery(query);
    }
}
