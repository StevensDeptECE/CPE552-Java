import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import java.io.*;

public class DKExample {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new FileReader("secret.txt"));
            String jdbcConnection = s.nextLine();
            s.close();

        Connection conn = null;
            conn =
            DriverManager.getConnection(jdbcConnection);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}