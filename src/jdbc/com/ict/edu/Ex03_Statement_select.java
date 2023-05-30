package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// CUSTOMER 테이블에서 박씨 성을 가진 사람 검색
public class Ex03_Statement_select {
public static void main(String[] args) {
	
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##pcl";
		String password = "1111";

		con = DriverManager.getConnection(url, user, password);

		String sql = "select * from CUSTOMER테이블 WHERE NAME LIKE '박%' ";

		stmt = con.createStatement();

		rs = stmt.executeQuery(sql);

		while (rs.next()) {
			System.out.print(rs.getString(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.print(rs.getString(4) + "\n");
		}
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e2) {
		}
	}
	
}
}
