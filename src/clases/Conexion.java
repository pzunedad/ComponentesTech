/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author pablo
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String URL ="jdbc:mysql://localhost:3306/bd_trabajo";
	private static final String USUARIO = "root";
	private static final String CLAVE = "Root";

	static {
		try {
			Class.forName(CONTROLADOR );
		}catch(ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		}
	}

	public Connection conectar() {
		Connection conexion = null;

		try {


			conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_trabajo", "root", "root");
			System.out.println("Conexion OK");

		}catch(SQLException e) {
			System.out.println("Error en la conexion");
			e.printStackTrace();
		}
		return conexion;
	}
}
