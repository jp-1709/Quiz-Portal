package Project;
import java.sql.*;


public class ConnectionProvider {

	public static Connection getcon()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quizapp","root","$Jp@1709");
			return con;
		}
		catch(Exception e)
		{
			return null;
		}
	}
}
