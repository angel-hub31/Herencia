package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		// se crea objeto Padre
		Padre p = new Padre("Pablo", 5, 2);
		p.ahorrar(500);
		// p.imprimir();
		System.out.println("Padre: " + p);

		// se crea objeto Hija
		Hija h = new Hija("Luis", 4, 1);
		h.ahorrar(500);
		// h.imprimir();
		System.out.println("Hija: " + h);

		// se cree objeto Hijo
		Hijo hj = new Hijo("Maria", 3, 4, 8);
		hj.ahorrar(500);
		// hj.imprimir();
		System.out.println("Hijo: " + hj);
		
		System.out.println();

		System.out.println("Notodos los hijos ahorran igual ... y en java eso se controla con sobreescritura");

	}

}
