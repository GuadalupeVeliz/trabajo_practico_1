package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {
	private int dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	public Persona(int dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}

	public Persona(int dni, String nombre, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia="Jujuy";
	}

	public Persona() {
		super();
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public int calcularEdad() {
		int edad;
		LocalDate fechaActual=LocalDate.now();
		edad=fechaActual.getYear()-this.fechaNacimiento.getDayOfMonth();
		if(fechaActual.getDayOfMonth()<this.fechaNacimiento.getDayOfMonth()) {
			edad--;
		}
		return edad;
	}
	
	public boolean verificarEdad() {
		return calcularEdad()>=18;
	}
	
	public void mostrarDatos() {
		System.out.println("DNI: "+this.dni);
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Provincia: "+this.provincia);
		System.out.println("Fecha de Nacimiento: "+this.fechaNacimiento);
		if(calcularEdad()>=10) {
			System.out.println("La persona es Mayor de edad");
		} else {
			System.out.println("La persona No es Mayor de edad ");
		}
	}
}
