package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dni,dia,mes,anio;
		String nombre,provincia;
		LocalDate fechaNacimiento;
		Persona persona = new Persona();
		
		System.out.println("Ingrese dni: ");
		dni=sc.nextInt();
		System.out.println("Ingrese nombre: ");
		nombre=sc.next();
		System.out.println("Ingrese fecha de nacimiento: año, mes, dia");
		anio=sc.nextInt();
		mes=sc.nextInt();
		dia=sc.nextInt();
		System.out.println("Provincia: ");
		provincia=sc.next();
		
		persona.setDni(dni);
		persona.setNombre(nombre);
		fechaNacimiento=LocalDate.of(anio, mes, dia);
        persona.setFechaNacimiento(fechaNacimiento);
		persona.setProvincia(provincia);
		persona.mostrarDatos();
		
		System.out.println("Ingrese dni: ");
		dni=sc.nextInt();
		System.out.println("Ingrese nombre: ");
		nombre=sc.next();
		System.out.println("Ingrese fecha de nacimiento: año, mes, dia");
		anio=sc.nextInt();
		mes=sc.nextInt();
		dia=sc.nextInt();
		System.out.println("Provincia: ");
		provincia=sc.next();
		Persona persona2= new Persona(dni,nombre,LocalDate.of(anio,mes,dia),provincia);
		persona2.mostrarDatos();
		System.out.println("Ingrese dni: ");
		dni=sc.nextInt();
		System.out.println("Ingrese nombre: ");
		nombre=sc.next();
		System.out.println("Ingrese fecha de nacimiento: año, mes, dia");
		anio=sc.nextInt();
		mes=sc.nextInt();
		dia=sc.nextInt();

		Persona persona3=new Persona(dni,nombre,LocalDate.of(anio,mes,dia));
		persona3.mostrarDatos();
		sc.close();
	}

}
