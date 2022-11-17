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
			mostrarReina();
			break;// Crear reina por defecto
		case 2:
			crearReinaColor();
			mostrarReina();
			break;// Crear reina eligiendo el color
		case 3:
			mover();
			mostrarReina();
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

	private static void mostrarReina() {
		if (reina == null) {
			System.out.println("No tiene ninguna reina creada");
		}
		System.out.println(reina.toString());
	}

	public static void main(String[] args) {

	}
}
