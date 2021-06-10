package com.ku.hc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

//���⼭ aop�� ����

public class DBManager {
	
	public static Connection connect() throws NamingException, SQLException {
		
		
		//context.xml
		Context ctx =new InitialContext();
		//Connection �뿩��--Ʃ�� �뿩��--���������ϱ� ���� �� ���α׷��� ���
		DataSource ds=(DataSource) ctx.lookup("java:comp/env/ksu");
		return ds.getConnection();
	}
	
	
	//������Ʈ-�ڵ�-����-���񽺽���
	
	//Ʃ�� �뿩�� ����, ��û�ϸ� �������� ����°�---����
	//db������ ��û�ϸ� �غ��س��� Ŀ�ؼ�(Ʃ��)�ٷ� ��---�߰�����
	
	
	/*���� �Ⱦ���
	 * 
	 * public static Connection connect() throws SQLException {
	 * 
	 * String url="jdbc:oracle:thin:@localhost:1521:xe"; return
	 * DriverManager.getConnection(url, "su", "su");
	 * 
	 * }
	 */
	// close --�ݳ� 
public static void close(Connection con,PreparedStatement pstmt,ResultSet rs) {
	try {
		rs.close();
	} catch (Exception e) {
	}
	try {
		pstmt.close();
	} catch (Exception e) {
	}
	try {
		con.close();
	} catch (Exception e) {
	}
	
}



}

