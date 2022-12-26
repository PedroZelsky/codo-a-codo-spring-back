package ar.com.codoacodo;

public class Auto {
	
	//Atributos
	boolean encendido;
	float velocidadActual;
	String marca;
	String modelo;
	int anio;
	float velocidadMaxima;
	
	
	//Constructor
	Auto(){
		this.encendido = false;
		this.velocidadMaxima = 200;
	}
	
	Auto(float velocidadMaxima){
		this.velocidadMaxima = velocidadMaxima;
	}
	
	//Métodos
	void encender() {
		if(!encendido) {
			encendido=true;
			System.out.println("Se ha encendido");
		}else {
			System.out.println("El auto ya está encendido");
		}
	};
	void apagar() {};
	void acelerar() {
		if(encendido) {
			System.out.println("Acelerando...");
			
		}else {
			System.out.println("Debe encender el auto primero");
		}
	};
	void frenar(){};
	void mostrarInfo() {
		System.out.println("encendido:"+encendido);
	}
	
}
