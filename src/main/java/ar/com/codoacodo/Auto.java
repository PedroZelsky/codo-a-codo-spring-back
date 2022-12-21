package ar.com.codoacodo;

public class Auto {
	
	//Atributos
	boolean encendido;
	float velocidad;
	String marca;
	String modelo;
	int anio;
	
	//Constructor
	Auto(){
		encendido = false;
	}
	
	//Métodos
	void encender() {
		encendido=true;
	};
	void apagar() {};
	void acelerar() {};
	void frenar(){};
	void mostrarInfo() {
		System.out.println("encendido:"+encendido);
	}
	
}
