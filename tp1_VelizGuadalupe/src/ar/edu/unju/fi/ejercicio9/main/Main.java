package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Producto producto=new Producto();
		int num=0,codigo;
		String nombre;
		double precio;
		int descuento=-1;
		while(num<3){
			System.out.println("Ingrese nombre del producto: ");
			nombre=sc.next();
			System.out.println("Ingrese codigo del producto: ");
			codigo=sc.nextInt();
			System.out.println("Ingrese precio del producto: ");
			precio=sc.nextDouble();
			while(descuento<0 || descuento>50) {
				System.out.println("Ingrese descuento: [0-50]");
				descuento=sc.nextInt();
			}
			producto.setNombre(nombre);
			producto.setCodigo(codigo);
			producto.setPrecio(precio);
			producto.setDescuento(descuento);
			
			System.out.println("Nombre: "+producto.getNombre());
			System.out.println("Codigo: "+producto.getCodigo());
			System.out.println("Precio: "+producto.getPrecio());
			System.out.println("Descuento: "+producto.getDescuento());
			System.out.println("Precio con descuento: "+producto.calcularDescuento());
			descuento=-1;
			num++;
		}
		sc.close();
	}

}
