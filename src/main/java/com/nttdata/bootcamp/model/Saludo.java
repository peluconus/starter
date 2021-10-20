package com.nttdata.bootcamp.model;

public class Saludo {
	
	private String idioma;

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Saludo(String idioma) {
		this.idioma = idioma;
	}
	
	public String mensajeSaludo() {
		String mensaje ="";
		switch (idioma) {
		case "Castellano":
			mensaje = "Bienvenido";
			break;
		case "Ingles":
			mensaje = "Welcome";
			break;
		case "Italiano":
			mensaje = "Bienvenute";
			break;
		default:
			mensaje = "Bienvenido";
			break;
		}
		return mensaje;
	}
}
