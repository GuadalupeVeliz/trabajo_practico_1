package ar.edu.unju.fi.ejercicio12.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaNac;
		
	public Persona() {
	}

	public Persona(String nombre, Calendar fechaNac) {
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Calendar fechaNac) {
		this.fechaNac = fechaNac;
	}
		
	public void mostrarPersona() {
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
		String fechaFormateada = formatoDeFecha.format(this.fechaNac.getTime());	
		System.out.println(
			"Nombre: " + getNombre()
			+ "\nFecha de nacimiento: " + fechaFormateada
			+ "\nEdad: " + getEdad() + " años"
			+ "\nSigno: " + getSignoZodiaco()
			+ "\nEstacion: " + getEstacion()
			);
	}
		
	public int getEdad() {
		Calendar fechaNac = this.fechaNac;
		long fechaNacInMillis = fechaNac.getTimeInMillis();	
		Calendar fechaActual = Calendar.getInstance();
		long fechaActualInMillis = fechaActual.getTimeInMillis();	
		float aniosDeDif = (fechaActualInMillis - fechaNacInMillis) / 1000 / 60 / 60 / 24 / 365;
		int anios = (int) aniosDeDif;
			
		return anios;
	}
		
	public String getSignoZodiaco() {
		String signo = "";
		int dia = this.fechaNac.get(Calendar.DAY_OF_MONTH);
		int mes = this.fechaNac.get(Calendar.MONTH) + 1;	
		switch (mes) {
			case 3: signo = dia>=21 ? "Aries" : "Piscis"; break;
			case 4: signo = dia>=20 ? "Tauro" : "Aries"; break;
			case 5: signo = dia>=21 ? "Geminis" : "Tauro"; break;
			case 6: signo = dia>=21 ? "Cancer" : "Geminis"; break;
			case 7: signo = dia>=23 ? "Leo" : "Cancer"; break;
			case 8: signo = dia>=23 ? "Virgo" : "Leo"; break;
			case 9: signo = dia>=23 ? "Libra" : "Virgo"; break;
			case 10: signo = dia>=23 ? "Escorpio" : "Libra"; break;
			case 11: signo = dia>=22 ? "Sagitario" : "Escorpio"; break;
			case 12: signo = dia>=22 ? "Capricornio" : "Sagitario"; break;
			case 1: signo = dia>=20 ? "Acuario" : "Capricornio"; break;
			case 2: signo = dia>=19 ? "Piscis" : "Acuario"; break;
			default: signo = "Error";
		}	
		return signo;
	}
		
	public String getEstacion() {
		String estacion = "";
		int dia = this.fechaNac.get(Calendar.DAY_OF_MONTH);
		int mes = this.fechaNac.get(Calendar.MONTH) + 1;
		if (mes == 1 || mes == 2) estacion = "Verano";
		if (mes == 3) estacion = dia>=21 ? "Otoño" : "Verano";
		if (mes == 4 || mes == 5) estacion = "Otoño";
		if (mes == 6) estacion = dia>=21 ? "Invierno" : "Otoño";
		if (mes == 7 || mes == 8) estacion = "Invierno";
		if (mes == 9) estacion = dia>=21 ? "Primavera" : "Invierno";
		if (mes == 10 || mes == 11) estacion = "Primavera";
		if (mes == 12) estacion = dia>=21 ? "Verano" : "Primavera";
		if (mes<1 || mes>12) estacion = "Error";
		return estacion;
	}
}

