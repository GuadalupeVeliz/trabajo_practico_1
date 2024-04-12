package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Pizza pizza = new Pizza();
		Double diametro=1.0;
		boolean ingredientesEspeciales;
		int num=0;
		
		while(num<3) {
			while(diametro != 20 && diametro != 30 && diametro != 40) {
				System.out.println("Ingrese diametro de la pizza: ");
				diametro=sc.nextDouble();
			}
			
			System.out.println("Desea agregar ingredientes Especiales ? : ");
			ingredientesEspeciales=sc.nextBoolean();
			pizza.setDiametro(diametro);
			pizza.setIngredientesEspeciales(ingredientesEspeciales);
			pizza.setPrecio(pizza.calcularPrecio(diametro, ingredientesEspeciales));
			pizza.calcularArea();
			System.out.println("** PIZZA "+num+" **");
			System.out.println("Diametro: "+pizza.getDiametro());
			System.out.println("Ingredientes especiales: " + pizza.isIngredientesEspeciales());
			System.out.println("Precio Pizza: "+ pizza.getPrecio()+"$");
			System.out.println("Area: "+ pizza.getArea());
			diametro=1.0;
			num++;
		}
		
		sc.close();

	}

}
