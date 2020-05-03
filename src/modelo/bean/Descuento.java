package modelo.bean;

public class Descuento {
	private int id;
	private int valor;
	private String descripcion;
	
	/**
	 * Constructor.
	 * 
	 * @param id: id del descuento
	 * @param valor: el valor del descuento 
	 * @param descripcion: descripcion del descuento
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Descuento [id=" + id + ", valor=" + valor + ", descripcion=" + descripcion + "]";
	}

}