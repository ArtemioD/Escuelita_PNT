package ejercicio_pnt;

import java.util.ArrayList;
import java.util.List;

public class Supermercado implements Comparable {
	private List<Producto> lista_prod = new ArrayList<Producto>();
	
	public void cargarLista() {
		lista_prod.add(new Bebida("Coca-Cola Zero", "1.5", 20));
		lista_prod.add(new Bebida("Coca-Cola", "1.5", 18));
		lista_prod.add(new ArtHigiene("Shampoo Sedal", "500", 19));
		lista_prod.add(new Verduleria("Frutillas", 64, "kilo"));
	}
	
	public void imprimirLista() {
		for (Producto producto : lista_prod) System.out.println(producto.toString());	
	}

	@Override
	public void masCaro() {
		int mayorPrecio = lista_prod.get(0).getPrecio();
		String prNombre = "";
		for (Producto producto : lista_prod) {
			if (producto.getPrecio() > mayorPrecio) {
				mayorPrecio = producto.getPrecio();
				prNombre = producto.getNombre();
			}
		}
		System.out.println("=============================");
		System.out.println("Producto mas caro: " + prNombre);
	}

	@Override
	public void masBarato() {
		int menorPrecio = lista_prod.get(0).getPrecio();
		String prNombre = "";
		for (Producto producto : lista_prod) {
			if (producto.getPrecio() < menorPrecio) {
				menorPrecio = producto.getPrecio();
				prNombre = producto.getNombre();
			}
		}
		System.out.println("Producto mas barato: " + prNombre);
	}	

}
