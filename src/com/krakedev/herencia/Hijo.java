package com.krakedev.herencia;
//clase Hijo hereda de clase Padre
public class Hijo extends Padre {
	//se agrega atributo privados 
	private int juguetes;
	
	//se crea un constructor que recibe parametros
	
	public Hijo(int virtudes,int defectos, int juguetes) {
		//usamos super() para inicializar virtudes y defectos en la clase Padre
		super(virtudes,defectos);
		//asignamos directamente el nuevo atributo
		this.juguetes = juguetes;
		
	}
// sobreescribimos el metodo toString mostrando el valor de juguetes
	@Override
	public String toString() {
		return super.toString() + " Juguetes: " + juguetes;
	}
	
	
	

}
