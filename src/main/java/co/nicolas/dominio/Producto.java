package co.nicolas.dominio;

public class Producto {
	private String nombre;
	private float codigo;
	private int precio;
	private int cantidadProducto;
	
	public Producto() {
		this.nombre  = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.cantidadProducto = cantidadProducto;
		
	}

	public String getNombre() {
		return nombre;
	}

	public float getCodigo() {
		return codigo;
	}

	public int getPrecio() {
		return precio;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCodigo(float codigo) {
		this.codigo = codigo;
	}
}
