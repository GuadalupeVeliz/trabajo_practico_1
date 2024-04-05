package ar.edu.unju.fi.ejericicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numero,i;
		System.out.println("Ingrese un numero: ");
		numero=sc.nextInt();
		sc.close();
		if(numero>=0 && numero<=9) {
			for(i=0;i<=10;i++) {
				System.out.println(numero+"x"+i+"="+i*numero);
			}
		}
		else {
			System.out.println("El numero ingresado debe estar en el rango [0-9]");
		}
	}

}
