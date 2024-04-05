package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numero, resultado=1;
		System.out.println("Ingrese un numero: ");
		numero=sc.nextInt();
		if(numero >=0 && numero<=10) {
			while(numero>0) {
				resultado=numero*resultado;
				numero--;
			}
			System.out.println("El resultado es: "+resultado);
		}else {
			System.out.println("El numero debe estar en el rango [0-10]");
		}
		sc.close();
	}
}
