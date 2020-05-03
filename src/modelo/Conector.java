package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 * @author byend
 * Esta clase crea la conexion a la base de datos con los datos de config
 */
public class Conector {
	
	protected Connection conexion;

	/**
	 * Constructor sin parametros
	 */
	protected Conector() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				this.conexion = DriverManager.getConnection("jdbc:mysql://" + Config.HOST + "/" + Config.BBDD, Config.USERNAME, Config.PASSWORD);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
	}

	
	/**
	 * getter
	 * 
	 * @return devuelve el atributo conexion
	 */
	public Connection getConexion() {
		return conexion;
	
	}

	/**
	 * setter 
	 * 
	 * @param conexion recibe como parametro conexion y lo asigna al atributo
	 */
	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
}