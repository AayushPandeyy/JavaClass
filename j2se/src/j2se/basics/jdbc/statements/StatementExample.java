package j2se.basics.jdbc.statements;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/mydb";
		String username = "root";
		String password = "Iamaprogram";
		Class.forName(driver);
		Product p = new Product("Mug","China","coffee mug",450.50f,true);
		Product p1 = new Product("Laptop","Lenovo","Laptop gaming",345670.5f,true);
		Connection con = DriverManager.getConnection(dbUrl,username,password);
		System.out.println("Connected Successfully.");
		String query = "insert into product (name, manufacturer, description, price, inStock)"+
		"values('"+p1.name+"', '"+p1.manufacturer+"', '"+p1.description+"', "+p1.price+","+p1.inStock+")";
		Statement st = con.createStatement();
		st.executeUpdate(query);
		System.out.println("Data entered.");
		con.close();
		
	}

}
