package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String nombre;
		int legajo;
		Double salario;
		System.out.println("Ingrese nombre del empleado: ");
		nombre=sc.next();
		System.out.println("Ingrese numero de legajo: ");
		legajo=sc.nextInt();
		System.out.println("Ingrese Salario: ");
		salario=sc.nextDouble();
		Empleado empleado= new Empleado(nombre,legajo,salario);
		empleado.mostrarDatos();
		empleado.aumentarSalario();
		empleado.mostrarDatos();
		sc.close();
	}

}
