import java.sql.*;

public class Conn {

	Connection c;
	Statement s;
	public Conn(){
		
		String url="jdbc:mysql://localhost:3306/electricity";
		String uname="root";
		String pass="12345";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    c=DriverManager.getConnection(url,uname,pass);
			s= c.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
