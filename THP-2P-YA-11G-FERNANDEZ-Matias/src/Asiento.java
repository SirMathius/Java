
public class Asiento {

	private Pasajero pasajero;
	private Clase clase;
	private int precio;

	public Asiento(int dni, int telefono, Clase clase) {
		this.pasajero = new Pasajero(dni, telefono);
		this.clase = clase;
		setPrecioSegunClase(clase);
	}

	private void setPrecioSegunClase(Clase clase) {
		final int PRECIO_PRIMERA = 150000;
		final int PRECIO_BUSINESS = 100000;
		final int PRECIO_TURISTA = 50000;

		int precio = 0;

		switch (clase) {
		case PRIMERA:
			precio = PRECIO_PRIMERA;
			break;
		case BUSINESS:
			precio = PRECIO_BUSINESS;
			break;
		case TURISTA:
			precio = PRECIO_TURISTA;
			break;
		}

		this.precio = precio;

	}

	public int getPrecio() {
		return this.precio;
	}

	public boolean esPasajero(int dni) {
		return this.pasajero.getDni() == dni;
	}

	@Override
	public String toString() {
		return "Asiento [pasajero=" + pasajero + ", clase=" + clase + ", precio=" + precio + "]";
	}

	public Clase getClase() {
		return this.clase;
	}

}
