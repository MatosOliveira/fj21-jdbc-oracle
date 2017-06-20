/**
 * 
 */
package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Matos
 *
 */
public class ConnectionFactory {

	public Connection getConnection(){
		try {
			return DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", USER, PASSWORD);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
