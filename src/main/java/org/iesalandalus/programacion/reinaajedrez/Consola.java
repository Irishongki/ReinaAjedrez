package org.iesalandalus.programacion.reinaajedrez;

public class Consola {

	private Consola() {

	}

	public void mostrarMenu() {
		System.out.println("Este es tu menú de opciones:");
		System.out.println("-----------------------------");
		System.out.println("1-Crear reina por defecto");
		System.out.println("2-Crear reina eligiendo el color");
		System.out.println("3-Mover");
		System.out.println("4-Salir");
		System.out.println("-----------------------------");
	}

}
