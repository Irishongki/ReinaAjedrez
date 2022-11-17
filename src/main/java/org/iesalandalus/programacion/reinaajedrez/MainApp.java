package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {

	private static Reina reina;

	private static void ejecutarOpcion(int opcion) {
		switch (opcion) {
		case 1:
			crearReinaDefecto();
			break;// Crear reina por defecto
		case 2:
			crearReinaColor();
			break;// Crear reina eligiendo el color
		case 3:
			break;// Mover
		case 4:
			Consola.despedirse();
			break;// Salir
		}
	}

	private static void crearReinaDefecto() {
		reina = new Reina();
	}

	private static void crearReinaColor() {
		reina = new Reina(Consola.elegirColor());

	}

	public static void main(String[] args) {

	}
}
