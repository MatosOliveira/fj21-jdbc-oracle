/**
 * 
 */
package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;

/**
 * @author Matos
 *
 */
public class TestaConexao {

	public static void main(String[] args) {
	
		Connection conn = new ConnectionFactory().getConnection();
		
		System.out.println("Conexão realizada com sucesso!");
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
