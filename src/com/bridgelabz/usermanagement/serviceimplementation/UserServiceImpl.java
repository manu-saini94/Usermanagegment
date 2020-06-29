package com.bridgelabz.usermanagement.serviceimplementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bridgelabz.usermanagement.service.UserService;

public class UserServiceImpl implements UserService {

	ResultSet rs = null;
	Connection con = null;
	Statement st = null;
	String status = "";

	public UserServiceImpl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usermanagement", "root", "root");
			st = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String checkLogin(String username, String password) throws SQLException {
		String s = "select * from users where username='" + username + "' and password='" + password + "'";
		rs = st.executeQuery(s);
		if (rs.next())
			status = "success";
		else
			status = "failure";
		return status;
	}

}
