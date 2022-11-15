package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

import javax.naming.OperationNotSupportedException;

public class Posicion {
	private int fila;
	private char columna;

	private void setFila(int fila) {
		if (fila < 1 | fila > 8) {
			throw new IllegalArgumentException("ERROR: Fila no válida.");
		}
		this.fila = fila;
	}

	public int getFila() {
		return fila;
	}

	private void setColumna(char columna) {
		if (columna < 'a' | columna > 'h') {
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}
		this.columna = columna;
	}

	public char getColumna() {
		return columna;
	}
}
	