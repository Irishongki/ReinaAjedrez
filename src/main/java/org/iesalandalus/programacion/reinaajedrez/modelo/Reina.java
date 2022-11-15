package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {

	private Color color;
	private Posicion posicion;

	// Creamos el constructor por defecto para crear una reina blanca con una nueva
	// posición
	public Reina() {
		color = Color.BLANCO;
		posicion = new Posicion(1, 'd');
	}

	public Reina(Color color) {
		setColor(color);
		switch (color) {
		case BLANCO:
			posicion = new Posicion(1, 'd');
			break;
		case NEGRO:
			posicion = new Posicion(8, 'd');
			break;
		}
	}

	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		if (color == null) {
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
		}
		this.color = color;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	private void setPosicion(Posicion posicion) {

		this.posicion = new Posicion(posicion);
	}

}
