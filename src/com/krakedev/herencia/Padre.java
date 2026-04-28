package com.krakedev.herencia;

public class Padre {
	private int defectos;
	private int virtudes;
	private double totalAhorrado;
	private String nombre;
	// en source: genera automaticamento el toString
	//@Override
	//public String toString() {
		//return "Padre [defectos=" + defectos + ", virtudes=" + virtudes + "]";
	//}
	
	
	//costructor vacio Padre
	//public Padre () {
		//System.out.println("Soy el contructor vacio del padre");
//	}
	
	public Padre(String nombre ,int virtudes, int defectos) {
		this.nombre=nombre;
		this.virtudes=virtudes;
		this.defectos=defectos;
		
	}
	
	@Override
	public String toString() {
		return "Nombre: "+nombre+ " Virtudes: " + virtudes + " Defectos: " + defectos + " Ahorrado: "+ totalAhorrado;
	}
	
	
	// se crea los getters y setters para poder acceder
	public int getDefectos() {
		return defectos;
	}
	public void setDefectos(int defectos) {
		this.defectos = defectos;
	}
	public int getVirtudes() {
		return virtudes;
	}
	public void setVirtudes(int virtudes) {
		this.virtudes = virtudes;
	}
	
	public double getTotalAhorrado() {
		return totalAhorrado;
	}

	public void setTotalAhorrado(double totalAhorrado) {
		this.totalAhorrado = totalAhorrado;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//public void: no retorna nada
	public void imprimir() {
		System.out.println("Virtudes: " + virtudes);
		System.out.println("Defectos: " + defectos);
		
	}
	
	public void guardarSecreto() {
		System.out.println("Esto no se hereda");;
	}
	//metodo ahorrar
	public void ahorrar(double monto) {
		totalAhorrado+=monto;
		
	}

}
