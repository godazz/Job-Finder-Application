package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    public static Connection conn;

    public static void Connect() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jobfinderdb","root", "root");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
