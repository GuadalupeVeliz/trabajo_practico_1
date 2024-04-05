package ar.edu.unju.fi.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1, num2, num3,num4,num5;
		double promedio;
		System.out.println("Ingrese un valor para el primer numero: ");
		num1=sc.nextInt();
		System.out.println("Ingrese un valor para el segundo numero: ");
		num2=sc.nextInt();
		System.out.println("Ingrese un valor para el tercer numero: ");
		num3=sc.nextInt();
		System.out.println("Ingrese un valor para el cuarto numero: ");
		num4=sc.nextInt();
		System.out.println("Ingrese un valor para el quinto numero: ");
		num5=sc.nextInt();
		promedio= (num1+num2+num3+num4+num5)/5.0;
		System.out.println("El promedio es: "+promedio);
		sc.close();
	}

}
