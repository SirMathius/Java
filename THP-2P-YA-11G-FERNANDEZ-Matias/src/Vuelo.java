
import java.util.ArrayList;
import java.util.List;

public class Vuelo {
	private String numeroVuelo;
	private int totalAsientos;
	private List<Asiento> reservas;
	private int recaudacion;

	public Vuelo(String numeroVuelo, int totalAsientos) {
		this.numeroVuelo = numeroVuelo;
		this.totalAsientos = totalAsientos;
		this.reservas = new ArrayList<>();
		this.recaudacion = 0;
	}

	public void listarAsientosReservados() {
		System.out.println("Vuelo: " + this.numeroVuelo);
		System.out.println("Reservados: " + reservas.size());
		System.out.println("-----------------------");
		System.out.println("Detalle de asientos");
		for (Asiento asiento : reservas) {
			System.out.println(asiento);
		}
	}

	public ResultadoReservaBoletos reservarAsiento(int dni, int telefono, Clase clase) {
		ResultadoReservaBoletos resultado;
		Asiento asiento;
		int precio;

		if (this.estaLleno()) {
			resultado = ResultadoReservaBoletos.COMPLETO;
		} else {
			asiento = buscarAsientoReservado(dni);

			if (asiento == null) {
				asiento = new Asiento(dni, telefono, clase);
				this.reservas.add(asiento);

				precio = asiento.getPrecio();
				actualizarRecaudacion(precio);

				resultado = ResultadoReservaBoletos.CONFIRMADA;
			} else {
				resultado = ResultadoReservaBoletos.RESERVADO;
			}

		}

		return resultado;

	}

	public void anularReserva(int dni) {

		Asiento asiento = this.buscarAsientoReservado(dni);

		if (asiento == null) {
			System.out.println("No existe una reserva con ese DNI");
		} else {
			this.reservas.remove(asiento);
			System.out.println("Se ha anulado la reserva con éxito");
		}

	}

	public void mostrarMontoRecaudadoDeClase(Clase clase) {

		int recaudado;

		if (this.reservas.isEmpty()) {
			System.out.println("No hay asientos reservados en ninguna clase");
		} else {
			recaudado = this.obtenerAcumuladoPorClase(clase);

			if (recaudado > 0) {
				System.out.println(
						"El monto acumulado hasta el momento en la clase " + clase.name() + " es de $" + recaudado);
			} else {
				System.out.println("No hay asientos reservados para clase " + clase.name());
			}
		}
	}

	private int obtenerAcumuladoPorClase(Clase clase) {
		int total = 0;

		for (Asiento asiento : this.reservas) {
			if (asiento.getClase().equals(clase)) {
				total += asiento.getPrecio();
			}
		}

		return total;
	}

	private Asiento buscarAsientoReservado(int dni) {
		Asiento asiento = null;
		Asiento comparar;
		int i = 0;

		while (asiento == null && i < this.reservas.size()) {
			comparar = this.reservas.get(i);

			if (comparar.esPasajero(dni)) {
				asiento = comparar;
			}

			i++;
		}

		return asiento;
	}

	private boolean estaLleno() {
		return !(this.reservas.size() < this.totalAsientos);
	}

	private void actualizarRecaudacion(int precio) {
		this.recaudacion += precio;
	}
}
