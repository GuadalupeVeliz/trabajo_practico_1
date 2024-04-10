package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		int num;
		System.out.println("Ingrese un numero: ");
		num=sc.nextInt();
		calculadora.setN(num);
		System.out.println("Resultado Sumatoria: "+calculadora.calcularSumatoria());
		System.out.println("Resultado Productoria:  "+calculadora.calcularProductoria());
		sc.close();
	}
}
