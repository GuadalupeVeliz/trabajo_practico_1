package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int num=1,i;
			String nombre;
			
			while(num<5 || num>10) {
				System.out.println("Ingrese un numero en el rango [5-10]: ");
				num=sc.nextInt();
			}
			
			String[] nombres= new String[num];
			for(i=0;i<num;i++) {
				System.out.println("Ingrese un nombre: ");
				nombre=sc.next();
				nombres[i]=nombre;
			}
			sc.close();
			for(i=0;i<num;i++) {
				System.out.println("Nombre: "+nombres[i]);
			}
			System.out.println("********************");
			for(i=num;i>0;i--) {
				System.out.println("Nombre: "+nombres[i-1]);
			}
		
	}
}
