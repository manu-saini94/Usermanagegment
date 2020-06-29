package com.bridgelabz.usermanagement.service;

import java.sql.SQLException;

public interface UserService {

	public String checkLogin(String username, String password) throws SQLException;

}
