package com.krakedev.herencia;

// extends hace que clse Hija 
//herede todos los atributos de la clase padre
public class Hija extends Padre {
	// se crea costructor heredado de Padre que recibe virtudes y defectos
	public Hija(String nombre,int virtudes, int defectos) {
		super(nombre,virtudes, defectos);

	}

	@Override
	public String toString() {
		return super.toString();
	}

	// super() llama al constructor vacio de Padre
	// public Hija() {
	// super();
//	}

	public void escucharBadBunny() {
		System.out.println("Escuchando esta musica horrible");

	}

	// Herencia no significa acceso total, sino acceso controlado

}
