package com.coffe.buy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;

import com.ku.hc.DBManager;

public class CoffeDAO {

	public static void getCoffee(HttpServletRequest request) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			con=DBManager.connect();
			String sql="select * from coffeeDB1 where c_no=?";
			pstmt=con.prepareStatement(sql);
			int no=Integer.parseInt(request.getParameter("no"));
			
			pstmt.setInt(1, no);
			
			rs=pstmt.executeQuery();
			Coffee coffees=null;
			if (rs.next()) {
				coffees=new Coffee();
				coffees.setC_no(rs.getInt("c_no"));
				coffees.setC_title(rs.getString("c_title"));
				coffees.setC_price(rs.getString("c_price"));
				coffees.setC_origin(rs.getString("c_origin"));
				coffees.setC_Information(rs.getString("c_Information"));


			}
			request.setAttribute("c", coffees);
			
			
			
			
			
			
		} catch (Exception e) {
e.printStackTrace();
		}finally {
			DBManager.close(con, pstmt, rs);
		}
	}

	

}
