package modelo.bean;

public class Talla {
	
	private int id;
	private String nombre;
	
	/**
	 * Constructor.
	 * 
	 * @param id: id de la talla
	 * @param nombre: nombre de la talla	
	 */
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Talla [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	

}
