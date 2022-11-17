package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

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
			mover();
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

	private static void mover() {
		Consola.mostrarMenuDirecciones();
		try {
			reina.mover(Consola.elegirDireccion(), Consola.elegirPasos());
		} catch (OperationNotSupportedException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {

	}
}
