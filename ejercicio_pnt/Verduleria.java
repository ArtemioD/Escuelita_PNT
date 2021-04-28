package ejercicio_pnt;

public class Verduleria extends Producto {
	private String undVenta;

	public Verduleria() {
		super();
	}

	public Verduleria(String nombre, int precio, String undVenta) {
		super(nombre, precio);
		this.undVenta = undVenta;
	}

	public String getUndVenta() {
		return undVenta;
	}

	public void setUndVenta(String undVenta) {
		this.undVenta = undVenta;
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " /// Precio: $" + getPrecio() + " /// Unidad de venta: " + undVenta;
	}
	
}
