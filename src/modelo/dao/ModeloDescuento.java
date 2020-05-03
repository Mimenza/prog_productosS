package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Conector;
import modelo.bean.Descuento;

public class ModeloDescuento extends Conector{
	
	/**
	 * descripcion:Crea una conexion y selecciona todo de descuentos, guarda los datos en rs y luego guarda esos datos en descuento con set
	 * por ultimo añade descuento a descuentos
	 * @return los descuentos
	 */
	public ArrayList<Descuento> getAll(){

		ArrayList<Descuento> descuentos = new ArrayList<Descuento>();

		try {

			PreparedStatement pst = super.conexion.prepareStatement("select * from descuentos");

			ResultSet rs = pst.executeQuery();



			while (rs.next()) {

				Descuento descuento = new Descuento();

				descuento.setId(rs.getInt("id"));

				descuento.setValor(rs.getInt("valor"));

				descuento.setDescripcion(rs.getString("descripcion"));

				

				descuentos.add(descuento);

			}



		} catch (SQLException e) {

			e.printStackTrace();

		}

		return descuentos;

	}

}