package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero;
		System.out.println("Ingrese un numero: ");
		numero=sc.nextInt();
		if(numero%2==0) {
			numero=numero*3;
		}
		else {
			numero=numero*2;
		}
		System.out.println("Numero final: "+numero);
		sc.close();
	}

}
