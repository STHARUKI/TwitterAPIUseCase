package com.twitter.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConn {
	static final String DRIVER = "com.mysql.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost/java_test?useSSL=false";
	//�������ӵ��Ǳ������ݿ⣬URL��java_testҪ�滻Ϊdatabase����
	static GetUserInfo usin = new GetUserInfo();
	static final String USERNAME = usin.getUser();
	static final String PASSWORD = usin.getPassword();
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			return conn;
		} catch(ClassNotFoundException cnfE) {
			System.err.println("Fail to load JDBC/ODBC.");
			cnfE.printStackTrace();
			return null;
		} catch(SQLException sqlE) {
			System.err.println("Can not connect to database.");
			sqlE.printStackTrace();
			return null;
		}//�����������������ݿ�
		
	}
}
