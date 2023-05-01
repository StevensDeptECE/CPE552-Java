import java.sql.*;
import java.util.*;
import java.io.*;

public class DKExample2 {
    public static void main(String[] args) {
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Scanner s = new Scanner(new FileReader("secret.txt"));
            String jdbcConnection = s.nextLine();
            s.close();

            Connection conn =
                DriverManager.getConnection(jdbcConnection);

            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM People");
            while (rs.next()) {
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                Integer id = rs.getInt("id");
                System.out.println("firstname=" + firstName + " lastname=" + lastName + " id=" + id);
            }
        } catch (SQLException ex){
        // handle any errors
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // it is a good idea to release
            // resources in a finally{} block
            // in reverse-order of their creation
            // if they are no-longer needed

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { 
                    sqlEx.printStackTrace();
                }
                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                    sqlEx.printStackTrace();
                } 
                stmt = null;
            }
        }
    }
}

