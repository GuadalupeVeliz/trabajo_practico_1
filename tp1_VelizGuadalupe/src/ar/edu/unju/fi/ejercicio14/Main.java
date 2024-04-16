package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int cantidad=-1,i,num,suma=0;
			
			while(cantidad<3 || cantidad >10) {
				System.out.println("Ingrese un numero que este entre el rango [3-10]: ");
				cantidad=sc.nextInt();
			}
			int [] numeros= new int[cantidad];
			for(i=0;i<cantidad;i++) {
				System.out.println("Ingrese un numero: ");
				num=sc.nextInt();
				numeros[i]=num;
			}
			sc.close();
			for(i=0;i<cantidad;i++) {
				System.out.println("Numero: "+numeros[i]);
				suma=suma+numeros[i];
			}
			System.out.println("Suma: "+suma);
		}

}
