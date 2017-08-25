package proj_mysqlconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ErSKS
 */
public class MySQLConnect {

    public static Connection conn;

    public static Connection connectDb() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cjt_db", "nepal", "Kt6tRCbCjq7PzXx9");
            System.out.println("Database Connected Successfully !");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Database cannot be connected !");
            System.exit(0);
        }
        return null;
    }
}
