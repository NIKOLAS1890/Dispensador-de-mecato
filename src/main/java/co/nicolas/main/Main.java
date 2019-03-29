package co.nicolas.main;

import java.util.ArrayList;

import co.nicolas.dominio.Maquina;
import co.nicolas.dominio.Producto;

public class Main {

	public static void main(String[] args) {
		Maquina maquina = new Maquina("AutoSnak", "AU123FXKL23");
		
		ArrayList<Producto>productos = new ArrayList<Producto>();	
		
		Producto galleta = new Producto();
		galleta.setNombre("TOSH");
		galleta.setPrecio(1120);
		galleta.setCodigo(1);
		galleta.setCantidadProducto(12);
		productos.add(galleta);
		
		Producto bimbo = new Producto();
		bimbo.setNombre("BIMBOLETES");
		bimbo.setPrecio(1250);
		bimbo.setCodigo(2);
		bimbo.setCantidadProducto(12);
		productos.add(bimbo);
		
		Producto paquete = new Producto();
		paquete.setNombre("CHOCLITOS");
		paquete.setPrecio(1120);
		paquete.setCodigo(3);
		paquete.setCantidadProducto(12);
		productos.add(paquete);
		
		Producto chocolatina = new Producto();
		chocolatina.setNombre("CHOCOLATE GOL");
		chocolatina.setPrecio(750);
		chocolatina.setCodigo(4);
		chocolatina.setCantidadProducto(12);
		productos.add(chocolatina);
		
		Producto chocolatinajumbo = new Producto();
		chocolatinajumbo.setNombre("CHOCOLATINA JUMBO MIX");
		chocolatinajumbo.setPrecio(1159);
		chocolatinajumbo.setCodigo(5);
		chocolatinajumbo.setCantidadProducto(12);
		productos.add(chocolatinajumbo);
		
		Producto paquetecriollo = new Producto();
		paquetecriollo.setNombre("CRIOLLO CHIPS");
		paquetecriollo.setPrecio(2000);
		paquetecriollo.setCodigo(6);
		paquetecriollo.setCantidadProducto(12);
		productos.add(paquetecriollo);
		
		Producto galletaclubsocial = new Producto();
		galletaclubsocial.setNombre("GALLETAS CLUB SOCIAL");
		galletaclubsocial.setPrecio(450);
		galletaclubsocial.setCodigo(7);
		galletaclubsocial.setCantidadProducto(12);
		productos.add(galletaclubsocial);
		
		Producto galletasfest = new Producto();
		galletasfest.setNombre("FESTIVAL");
		galletasfest.setPrecio(600);
		galletasfest.setCodigo(8);
		galletasfest.setCantidadProducto(0);
		productos.add(galletasfest);
		
		Producto paqueteminichips = new Producto();
		paqueteminichips.setNombre("MINICHIPS");
		paqueteminichips.setPrecio(850);
		paqueteminichips.setCodigo(9);
		paqueteminichips.setCantidadProducto(3);
		productos.add(paqueteminichips);
		
		Producto frunas = new Producto();
		frunas.setNombre("FRUNAS");
		frunas.setPrecio(600);
		frunas.setCodigo(10);
		frunas.setCantidadProducto(0);
		productos.add(frunas);
		
		maquina.setProductos(productos);
		
		System.out.println("PRODUCTO AGOTADO");
		System.out.print(maquina.consultarProductoAgotado()+"\n");
		System.out.println("INFORMACION DE LAS CANTIDADES DISPONIBLES DE UN PRODUCTO");
		System.out.println(maquina.consultarTotalUnidadesProducto()+"\n");
		System.out.println("AUMENTO DE PRODUCTO EN UNA UNIDAD");
		System.out.println(maquina.aumentarUnidadDeUnProducto());
		System.out.println("DISMINUCION DE PRODUCTO EN UNA UNIDAD POR NOMBRE O CÓDIGO");
		System.out.println(maquina.sacarUnidadDeUnProducto());
		System.out.println("CONSULTA TOTAL UNIDADES MAQUINA");
		System.out.println(maquina.consultarTotalUnidadesMaquina());
	}

}
