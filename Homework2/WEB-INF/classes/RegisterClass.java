import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterClass {
	
	private String dbUrl = "jdbc:mysql://localhost:3306/userdb?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
	private String dbUname = "kostas";
	private String dbPassword = "kostaswwwhw2";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public String insert (Product product) {
		loadDriver(dbDriver);
		Connection con = getConnection();
		String result = "Data entered successfully!\n";
		String sql = "insert into product values(?,?,?,?)";
		
		PreparedStatement ps;
		try {
		ps = con.prepareStatement(sql);
		ps.setString(1, product.getBarcode());
		ps.setString(2, product.getName());
		ps.setString(3, product.getColor());
		ps.setString(4, product.getDescription());
		ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Data not entered! Please check that you didn't insert the same barcode with another product.";
		}
		return result+ "<br><br>" + "Your Product data are:<br>" + "Barcode: " +product.getBarcode() + "<br>Name: " 
		+ product.getName() + "<br>Color: " + product.getColor() + "<br>Description: " + product.getDescription();
	}
}
