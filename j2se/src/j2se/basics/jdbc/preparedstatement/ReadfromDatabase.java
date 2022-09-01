package j2se.basics.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;

public class ReadfromDatabase {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/mydb";
		String username = "root";
		String password = "Iamaprogram";
		Class.forName(driver);
		Product p = new Product();

		Connection con = DriverManager.getConnection(dbUrl,username,password);
		System.out.println("Connected Successfully.");
		String query = "select * from product where id = ?";
		PreparedStatement pstm = con.prepareStatement(query);
		System.out.println("Enter the id: ");
		pstm.setInt(1,new Scanner(System.in).nextInt());
		ResultSet rs = pstm.executeQuery();
		if(rs.next()) {
			p.id = rs.getInt("id");
			p.name = rs.getString("name");
			p.manufacturer = rs.getString("manufacturer");
			p.description = rs.getString("description");
			p.price = rs.getFloat("price");
			p.inStock = rs.getBoolean("inStock");
		}
		System.out.println(p);
		pstm.close();
		con.close();
}
}
