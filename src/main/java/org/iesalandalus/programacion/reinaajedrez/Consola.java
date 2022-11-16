package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	private Consola() {

	}

	public static void mostrarMenu() {
		System.out.println("Este es tu menú de opciones:");
		System.out.println("-----------------------------");
		System.out.println("1-Crear reina por defecto");
		System.out.println("2-Crear reina eligiendo el color");
		System.out.println("3-Mover");
		System.out.println("4-Salir");
		System.out.println("-----------------------------");
	}

	public static int elegirOpcionMenu() {
		int opcion;
		do {
			System.out.print("Escoja una opción del menú: ");
			opcion = Entrada.entero();
		} while (opcion < 1 | opcion > 4);
		System.out.print("Tu opción elegida es: ");
		return opcion;
	}

	public static Color elegirColor() {
		int opcion;
		do {
			System.out.print("Escoja un color (1.Blanco, 2.Negro) : ");
			opcion = Entrada.entero();
		} while (opcion < 1 | opcion > 2);
		if (opcion == 1) {
			return Color.BLANCO;
		}
		return Color.NEGRO;

	}

	public static void mostrarMenuDirecciones() {
		System.out.println("Este es tu menú de direcciones:");
		System.out.println("-----------------------------");
		System.out.println("1-NORTE");
		System.out.println("2-NORESTE");
		System.out.println("3-ESTE");
		System.out.println("4-SURESTE");
		System.out.println("5-SUR");
		System.out.println("6-SUROESTE");
		System.out.println("7-OESTE");
		System.out.println("8-NOROESTE");
		System.out.println("-----------------------------");
	}

	public static Direccion elegirDireccion() {
		int opcion;
		Direccion direccion = null;
		do {
			System.out.print("Escoja una dirección del menu anterior :");
			opcion = Entrada.entero();
		} while (opcion < 1 | opcion > 8);

		switch (opcion) {
		case 1:
			direccion = Direccion.NORTE;
			break;
		case 2:
			direccion = Direccion.NORESTE;
			break;
		case 3:
			direccion = Direccion.ESTE;
			break;
		case 4:
			direccion = Direccion.SURESTE;
			break;
		case 5:
			direccion = Direccion.SUR;
			break;
		case 6:
			direccion = Direccion.SUROESTE;
			break;
		case 7:
			direccion = Direccion.OESTE;
			break;
		}
		return direccion;
	}

	public static int elegirPasos() {
		int pasos;
		System.out.print("Escoja el número de pasos a mover :");
		pasos = Entrada.entero();
		return pasos;
	}

	public static void despedirse() {
		System.out.println("Hasta luego Amigo!");
	}

}
