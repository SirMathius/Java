
public enum ResultadoReservaBoletos {
	COMPLETO("Error avi�n completo"), RESERVADO("Error ya tiene un pasaje"), CONFIRMADA("Reserva confirmada");

	private String texto;

	ResultadoReservaBoletos(String texto) {
		this.texto = texto;
	}

	public String texto() {
		return this.texto;
	}

}
