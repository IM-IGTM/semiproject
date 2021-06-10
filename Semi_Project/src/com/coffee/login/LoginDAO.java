package com.coffee.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.hs.main.DBManager;

public class LoginDAO {

	public static void login(HttpServletRequest request) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String userID = request.getParameter("id");
		String userPW = request.getParameter("pw");

		try {
			String sql = "select * from login_test where l_id = ?";
//			String sql = "select l_id, l_pw from login_test, regMember where l_id = m_regID and l_pw= m_regPW";

			con = DBManager.connect();
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, userID);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				String dbID = rs.getString("l_id");
				String dbPW = rs.getString("l_pw");
				System.out.println(dbID);
				if (userPW.equals(dbPW)) {
					User u = new User();
					u.setL_id(dbID);
					u.setL_name(rs.getString("l_name"));
					u.setL_pw(dbPW);
					request.setAttribute("result", "�α��� ����!");

					HttpSession hs = request.getSession();
					hs.setMaxInactiveInterval(5);

					hs.setAttribute("user", u);

				} else {
					request.setAttribute("result", "��й�ȣ ����!");
				}
			} else {
				request.setAttribute("result", "�������� �ʴ� ȸ���Դϴ�!");

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}

	}

	public static void reg(HttpServletRequest request) {

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBManager.connect();

			String sql = "insert into regMember values(?, ?, ?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);

			String regID = request.getParameter("regID");
			String regPW = request.getParameter("regPW");
			String regPW2 = request.getParameter("regPW2");
			String regName = request.getParameter("regName");
			String regAddr = request.getParameter("regAddr");
			int regPhoneNumber = Integer.parseInt(request.getParameter("regPhoneNumber"));
			String regEmail = request.getParameter("regEmail");

			pstmt.setString(1, regID);
			pstmt.setString(2, regPW);
			pstmt.setString(3, regPW2);
			pstmt.setString(4, regName);
			pstmt.setString(5, regAddr);
			pstmt.setInt(6, regPhoneNumber);
			pstmt.setString(7, regEmail);

				if (pstmt.executeUpdate() == 1) {
					request.setAttribute("result", "ȸ�������� �Ϸ�Ǿ����ϴ�");
				} 

			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("result", "ȸ������ ����");

		} finally {
			DBManager.close(con, pstmt, null);
		}

	}

}
