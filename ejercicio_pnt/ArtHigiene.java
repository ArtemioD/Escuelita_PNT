package ejercicio_pnt;

public class ArtHigiene extends Producto {
	private String contenido;

	public ArtHigiene() {
		super();
	}

	public ArtHigiene(String nombre, String contenido, int precio) {
		super(nombre, precio);
		this.contenido = contenido;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " /// Contenido: " + contenido + "ml /// Precio: $" + getPrecio();
	}

}
