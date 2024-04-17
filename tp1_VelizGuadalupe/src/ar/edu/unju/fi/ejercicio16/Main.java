package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		byte indice=5, indiceEliminar,i=0;
		String[] nombres = new String[indice];
		String nombre;
		 
		for(i=0; i<indice;i++) {
			System.out.println("Ingrese nombre: ");
			nombre=sc.next();
			nombres[i]=nombre;
		}
		System.out.println("*********************");
		while(i<5) {
			System.out.println(nombres[i]);
			i++;
		}
		System.out.println("Tamaño del arreglo : "+nombres.length);
		do {
			System.out.println("Ingrese un numero entre 0 y 4: ");
			indiceEliminar=sc.nextByte();
		}while(indiceEliminar<0 || indiceEliminar>5);
		
		for( i=indiceEliminar;i<4;i++) {
			nombres[i]=nombres[i+1];
		}
		nombres[i]="";
		
		for(i=0;i<nombres.length;i++) {
			System.out.println(nombres[i]);
		}
		sc.close();
	}

}
