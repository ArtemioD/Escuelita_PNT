package ejercicio_pnt;

public class Bebida extends Producto {
	private String cant_litros;
	
	public Bebida() {
		super();
	}


	public Bebida(String nombre, String cant_litros, int precio) {
		super(nombre, precio);
		this.cant_litros = cant_litros;
	}


	public String getCant_litros() {
		return cant_litros;
	}


	public void setCant_litros(String cant_litros) {
		this.cant_litros = cant_litros;
	}


	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " /// Litros: " + cant_litros  + " /// Precio: $" + getPrecio();
	}
	
}
