package seleniumCoreFeature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//Register the databasedriver
		Class.forName("com.mysql.jdbc.Driver"); 
		//Create connection to the databse
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root1234"); 
		//Create the statement
		Statement stmt = con.createStatement();
		//Execute the query
		ResultSet rs = stmt.executeQuery("SELECT * FROM sakila.customer");
		while(rs.next()) {
			String fname = rs.getString("first_name");
			String lname = rs.getString("last_name");
			System.out.println("FirstName==" + fname + " : " + "LastName==" + lname);
			con.close();
		}
	}
}