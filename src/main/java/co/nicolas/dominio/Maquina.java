package co.nicolas.dominio;

import java.util.ArrayList;

public class Maquina {
	private String nomProducto;
	private String marca;
	private String serial;
	private int cantidadProducto;
	public ArrayList<Producto> productos;

	public Maquina(String marca, String serial) {
		this.marca = marca;
		this.serial = serial;
		this.productos = productos;
		productos = new ArrayList<>();
	}
	
	public String sacarUnidadDeUnProducto() {
		for (int i = 0; i < productos.size(); i++) {
			if (productos.get(i).getCodigo() == 9) {
				int nuevaCantidad = productos.get(i).getCantidadProducto();
				nuevaCantidad--;	
				System.out.println("El producto "+productos.get(i).getNombre()+" disminuyó a "+nuevaCantidad+ " cantidades");
			
			}else if(productos.get(i).getNombre() == "GALLETAS CLUB SOCIAL") {
				int nuevaCantidad = productos.get(i).getCantidadProducto();
				nuevaCantidad--;
				System.out.println("El producto "+productos.get(i).getNombre()+" disminuyó a "+nuevaCantidad+ " cantidades");
			
			}else if(productos.get(i).getNombre() == "FRUNAS" || productos.get(i).getCodigo() == 10) {
				System.out.println("El producto "+productos.get(i).getNombre()+" está agotado");
			}
		}
		return "";
	}
	
	public String consultarProductoAgotado() {  
		String ceroBuscado = null;  
		for (Producto nomProducto : productos) {  
			if(nomProducto.getCantidadProducto() == 0) { 
				ceroBuscado = nomProducto.getNombre();
				System.out.println("El producto agotado es "+ceroBuscado);
			}
		}
		return "";
	}

	public String consultarTotalUnidadesProducto() {
		for (int i = 0; i < productos.size(); i++) {		
			if (productos.get(i).getCodigo() == 9 || productos.get(i).getNombre() == "MINICHIPS") {
				cantidadProducto = productos.get(i).getCantidadProducto();	
				System.out.println("El producto "+productos.get(i).getNombre()+" tiene "+ cantidadProducto+" unidades disponibles");
			}
		}
		return "";	
	}
	
	public String consultarTotalUnidadesMaquina() {
		this.cantidadProducto = cantidadProducto;
		int cantidadProducto2 = 0;
		for (int i = 0; i < productos.size(); i++) {
			cantidadProducto = productos.get(i).getCantidadProducto();
			cantidadProducto2  += productos.get(i).getCantidadProducto();
		}
		return "La maquina tiene un total de "+cantidadProducto2+" unidades\n";
	}
	
	public String aumentarUnidadDeUnProducto() {
		for (int i = 0; i < productos.size(); i++) {		
			if (productos.get(i).getCodigo() == 9 || productos.get(i).getNombre() == "MINICHIPS") {
				int nuevaCantidad = productos.get(i).getCantidadProducto();
				nuevaCantidad++;	
				System.out.println("El producto "+productos.get(i).getNombre()+" aumentó a "+ nuevaCantidad+" unidades disponibles");
			}
		}
		return "";
	}

	public String getMarca() {
		return marca;
	}

	public String getSerial() {
		return serial;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
}
