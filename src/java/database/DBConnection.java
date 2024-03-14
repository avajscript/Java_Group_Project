/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author matth
 */
public class DBConnection {
	private static Connection connection = null;
	
	private DBConnection() {
		
	}
	
	public Connection getInstance() {
		if (connection == null || connection.isClosed()) {
			connection = DriverManager.getConnection(url)
		}
	}
}
