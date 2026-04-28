package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;

public class TestPrivado {

	public static void main(String[] args) {
		Hija hija=new Hija("Josefina",10,3);
		
		// no podemos utilizar metodos de tipo privado
		//en una clase que estan heredando
		// ya que solo podemos utilizar de metodos de tipo publico
		hija.guardarSecreto();
		
	}

}
