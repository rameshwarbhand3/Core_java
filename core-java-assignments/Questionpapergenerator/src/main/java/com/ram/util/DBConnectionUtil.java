package com.ram.util;

import java.sql.Connection;
import java.sql.SQLException;

public interface DBConnectionUtil {
	public Connection getConnection() throws ClassNotFoundException, SQLException;
	public void closeConnection() throws SQLException;
}
