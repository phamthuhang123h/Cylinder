package Exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class XL {
	private Connection cn;
	
	public Connection getCon(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/cylinder","root","0969616256hang");
			System.out.println("oke");
		}catch (ClassNotFoundException | SQLException e) {
		// TODO: handle exception
		}
		return cn;
	}
		public ArrayList<Cylinder> loadData(){
			
			Connection cn = getCon();
			String sql = "Select * from tbCylinder";
			ArrayList<Cylinder> lists = new ArrayList<>();
			try {
				PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					Cylinder k = new Cylinder();
					k.setRadius(rs.getDouble("radius"));
					k.setHeight(rs.getDouble("height"));
					k.setVolumn(rs.getDouble("volumn"));
					k.setArea(rs.getDouble("area"));
					k.setColor(rs.getString("color"));
					lists.add(k);
				}
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
			return lists;
	}
}

}
