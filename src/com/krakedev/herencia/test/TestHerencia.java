package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;

public class TestHerencia {

	public static void main(String[] args) {
		// instanciamos una clase hija 
		//heredando todos los atributos de la clase padre
		Hija hija =new Hija("Maria",3,1);
		//seteamos 
		hija.setVirtudes(5);
		hija.setDefectos(2);
		//imprimimos  invocando el metodo imprimir 
		//heredado de la clase padre hacia la clase hija
		hija.imprimir();
		
		
	}

}
