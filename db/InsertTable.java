import java.sql.*;

public class InsertTable {
   static final String DB_URL = "jdbc:mysql://localhost/test";
   static final String USER = "dkruger";
   static final String PASS = "123";
   static final String QUERY = "SELECT name, population, country FROM test.Cities";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
					//stmt.executeUpdate("use test");
					//					stmt.close();
					
         ResultSet rs = stmt.executeQuery(QUERY);) {
         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            System.out.print(rs.getString("name"));
            System.out.print(rs.getInt("population"));
            System.out.print(rs.getString("country"));
						System.out.println();
						
            //System.out.print(rs.getString(1));
            //System.out.print(rs.getInt(2));
            //System.out.print(rs.getString(3));


				 }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
