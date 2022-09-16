import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class FirstJDBC {
	private static Properties p;
	private static String connectStr;
	private  Connection connect;
	private Statement statement;
	private ResultSet resultSet;

	static {
		Properties p = new Properties();
		p.load("first.properties");
		// This will load the MySQL driver, each DB has its own driver
		String driverName = p.get("driver");
		Class.forName(driverName);
		connectStr = p.get("conn");
	}

	public FirstJDBC() {
		try {
			connect = null;
			statement = null;
			resultSet = null;
			connect = DriverManager.getConnection(conn);
			executeQuery();
			executeUpdate();
		} catch(Exception e) {
			try {
				if (resultSet != null) {
					rs.close();
				}

				if (statement != null) {
					statement.close();
				}

				if (connect != null) {
					connect.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void executeQuery() throws Exception {
		statement = connect.createStatement();
		ResultSet rs = statement.executeQuery
			("select firstName, lastName from People");
		while (resultSet.next()) {
			String firstName = resultSet.getString("firstName"); // don't use 1!!!
			String lastName = resultSet.getString("lastName"); // don't use 2!!!
			System.out.println(firstName + ", " + lastName);
		}
		rs.close();
		statement.close();
		statement = null;
		rs = null;
	}

	public void executeUpdate() throws Exception {
		statement = connect.createStatement();
    int rows = statement.executeUpdate("delete People where lastname 'Kruger'");
		statement.close();
		statement=null;
	}
	
	public static void main(String[] args) {
		new FirstJDBC();

	}
}
