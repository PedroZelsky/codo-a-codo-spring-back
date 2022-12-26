package ar.com.codoacodo.herencia;

import java.util.Date;

public class Articulo {

	private String img;
	private String titulo;
	private String autor;
	private Float precio;
	private Date fechaPublicacion;
	private int cantidadVendido;
	
	

	public Articulo(String img, String titulo, String autor, Float precio) {
		this.img = img;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}


	public String getImg() {
		return img;
	}
	
	public String setImg(String img) {
		if(img!=null) {
			this.img = img;
		}else {
			this.img = "Marca de agua";
		}
		return img;
	}


	public String getTitulo() {
		/* if(this.titulo!=null) 
			this.titulo = this.titulo.toUpperCase();
		return this.titulo;*/

		return this.titulo!=null ? this.titulo.toUpperCase() : this.titulo;
	}


	public String getAutor() {
		return autor;
	}


	public float getPrecio() {
		return precio;
	}


	@Override
	public String toString() {
		return "Articulo [img=" + img + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}
	
	
	
	
	
}
