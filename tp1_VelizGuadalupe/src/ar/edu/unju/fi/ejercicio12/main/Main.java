package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		Persona persona=new Persona();
		Calendar fechaNac = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		String nombre;
		int dia, mes, anio;
		System.out.println("Ingrese nombre: ");
		nombre=sc.next();
		System.out.println("Ingrese fecha de nacimiento: ");
		System.out.println("Fecha de nacimiento:");
		System.out.print("Dia: ");
		dia = sc.nextInt();
		System.out.print("Mes: ");
		mes = sc.nextInt();
		System.out.print("Año: ");
		anio = sc.nextInt();
		fechaNac.set(anio, mes-1, dia);
		persona.setNombre(nombre);
		persona.setFechaNac(fechaNac);
		persona.mostrarPersona();
		sc.close();
			
	}

}
