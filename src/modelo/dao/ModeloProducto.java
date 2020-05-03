package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Conector;
import modelo.bean.Producto;
import modelo.bean.Talla;

public class ModeloProducto extends Conector{

	/**
	 * descripcion: crea un arraylist de productos y seleciona todo de productos y los guarda en rs para luego guardarlos en producto
	 * por ultimo a�ade producto a productos
	 * @return los prodcutos
	 */
	public ArrayList<Producto> getAll(){
		
		
		ArrayList<Producto> productos =new ArrayList<Producto>();
		
		try {
			
			Statement st=super.conexion.createStatement();
			ResultSet rs=st.executeQuery("select * from productos");
			
			while(rs.next()) {
				
				Producto producto=new Producto();
				
				producto.setId(rs.getInt("id"));
				producto.setNombre(rs.getString("nombre"));
				producto.setStock(rs.getInt("stock"));
				producto.setFecha_compra(rs.getDate("fecha_compra"));
				producto.setColor(rs.getString("color"));
				producto.setMade_in(rs.getString("made_in"));
				producto.setPrecio(rs.getDouble("precio"));
				producto.setDescuento(rs.getInt("descuento"));
				producto.setTallas(rs.getString("tallas"));
				
				productos.add(producto);
				
			}
			
			return productos;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return productos;
	}
	
	/**
	 * Descripcion: selecciona los productos dependiendo de id que tenga , guarda los datos en rs y luego en productos mediante set 
	 * @param id
	 * @return el producto
	 */
	public Producto get(int id) {
		
		//TODO implementar
		
		try {
			PreparedStatement pst=super.conexion.prepareStatement("select * from productos where id=?");
			pst.setInt(1, id);
			ResultSet rs=pst.executeQuery();
			
			if(rs.next()){
				
				Producto producto=new Producto();
				
				producto.setId(rs.getInt("id"));
				producto.setNombre(rs.getString("nombre"));
				producto.setStock(rs.getInt("stock"));
				producto.setFecha_compra(rs.getDate("fecha_compra"));
				producto.setColor(rs.getString("color"));
				producto.setMade_in(rs.getString("made_in"));
				producto.setPrecio(rs.getDouble("precio"));
				producto.setDescuento(rs.getInt("descuento"));
				producto.setTallas(rs.getString("tallas"));
				
				return producto;
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * Descripcion: inserta en los productos los valores que se le pasa 
	 * @param producto
	 */
	public void insert(Producto producto) {
		//TODO implementar
		
		try {
			
			PreparedStatement pst=super.conexion.prepareStatement("insert into productos (nombre, stock, fecha_compra, color, made_in, precio, descuento, tallas) values (?,?,?,?,?,?,?,?)");
			
			pst.setString(1, producto.getNombre());
			pst.setInt(2, producto.getStock());
			pst.setDate(3, new java.sql.Date(producto.getFecha_compra().getTime()));
			pst.setString(4, producto.getColor());
			pst.setString(5, producto.getMade_in());
			pst.setDouble(6, producto.getPrecio());
			pst.setInt(7, producto.getDescuento());
			pst.setString(8, producto.getTallas());
			
			pst.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	/**
	 * Descripcion: actualiza los productos con los datos del producto que le llegan.
	 * @param producto
	 */
	public void update(Producto producto) {
		//TODO implementar
		
		try {
			PreparedStatement pstUpdate=super.conexion.prepareStatement("update productos set nombre=?, stock=?, fecha_compra=?, made_in=?, precio=?, descuento=?, tallas=?");
			producto.setNombre(producto.getNombre());
			producto.setStock(producto.getStock());
			producto.setFecha_compra(producto.getFecha_compra());
			producto.setMade_in(producto.getMade_in());
			producto.setPrecio(producto.getPrecio());
			producto.setDescuento(producto.getDescuento());
			producto.setTallas(producto.getTallas());
			
			pstUpdate.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Descripcion: Elimina un producto segun el id que le den 
	 * @param id
	 */
	public void delete(int id) {
		//TODO implementar
		
		try {
			
			PreparedStatement pstDelete=super.conexion.prepareStatement("delete from productos where id=?");
			pstDelete.setInt(1, id);
			pstDelete.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Producto> deLaTalla(Talla talla){
		//TODO implementar, un poco mas dificil
		return null;
	}
}