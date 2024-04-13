package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[8];
		int num,i;
		for(i =0;i<8;i++) {
			System.out.println("Ingrese un numero: ");
			num=sc.nextInt();
			numeros[i]=num;
		}
		for(i=0;i<8;i++) {
			System.out.println(" Posicion: "+i+" Numero: "+numeros[i]);
		}
	}

}
