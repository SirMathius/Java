public class Test {

	public static void main(String[] args) {

		Vuelo vuelo = new Vuelo("AA3313", 180);

		ResultadoReservaBoletos resultado = vuelo.reservarAsiento(11111111, 1234567890, Clase.PRIMERA);
		System.out.println(resultado.texto());
		resultado = vuelo.reservarAsiento(22222222, 1234567891, Clase.PRIMERA);
		System.out.println(resultado.texto());
		resultado = vuelo.reservarAsiento(33333333, 1234567892, Clase.TURISTA);
		System.out.println(resultado.texto());
		resultado = vuelo.reservarAsiento(44444444, 1234567894, Clase.TURISTA);
		System.out.println(resultado.texto());
		resultado = vuelo.reservarAsiento(55555555, 1234567895, Clase.BUSINESS);
		System.out.println(resultado.texto());
		resultado = vuelo.reservarAsiento(11111111, 1234567890, Clase.PRIMERA);
		System.out.println(resultado.texto());
		System.out.println();

		vuelo.mostrarMontoRecaudadoDeClase(Clase.PRIMERA);
		System.out.println();
		vuelo.mostrarMontoRecaudadoDeClase(Clase.BUSINESS);
		System.out.println();
		vuelo.mostrarMontoRecaudadoDeClase(Clase.TURISTA);
		System.out.println();

		vuelo.listarAsientosReservados();
		System.out.println();

		vuelo.anularReserva(55555555);
		vuelo.anularReserva(99999999);
		System.out.println();

		vuelo.mostrarMontoRecaudadoDeClase(Clase.BUSINESS);
		System.out.println();

		vuelo.listarAsientosReservados();
	}

}