package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		ArrayList <Pais> paises= new ArrayList<>();
		ArrayList<DestinoTuristico> destinos = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		cargarLista(paises);
		int op=12;
		while(op!=9) {
			try {op=menu(sc);
			}catch(InputMismatchException e) {
				System.out.println("Debe ingresar un numero ");
			}
			switch(op) {
			case 1:
				guardarDestino(destinos,sc,paises);
				break;
			case 2:
				mostrarDestinos(destinos);
				break;
			case 3:
				modificarPais(destinos,sc,paises);
				break;
			case 4:
				limpiarArray(destinos);
				break;
			case 5:
				eliminarDestino(destinos,sc);
				break;
			case 6:
				mostrarDestinosOrdenados(destinos);
				break;
			case 7:
				mostrarPaises(paises);
				break;
			case 8:
				mostrarDestinosPorPais(destinos,paises,sc);
				break;
			case 9:
				System.out.println("Fin del Menú :)");
				break;
			default:
				System.out.println("Ingrese un numero [1-9]: ");
			}
			sc.nextLine();
		}
		sc.close();
	}
	
	public static void cargarLista(ArrayList<Pais> paises) {
		paises.add(new Pais (1,"Argentina"));
		paises.add(new Pais(2,"Brasil"));
		paises.add(new Pais(3,"Canada"));
		paises.add(new Pais(4,"China"));
		paises.add(new Pais(5,"Francia"));
		paises.add(new Pais(6,"Alemania"));
		paises.add(new Pais(7,"Mexico"));
		paises.add(new Pais(8,"Paraguay"));
		paises.add(new Pais(9,"España"));
		paises.add(new Pais(10,"Italia"));
	}
	
	public static int menu(Scanner sc) {
		int op;
		System.out.println("************ MENU *****************");
		System.out.println("1)Alta de destino turistico");
		System.out.println("2)Mostrar todos los destinos turisticos");
		System.out.println("3)Modificar el pais de un destino Turistico");
		System.out.println("4)Limpiar el ArrayList de destino Turistico");
		System.out.println("5)Eliminar un destino Turistico");
		System.out.println("6)Mostrar los Destinos Turisticos ordenados por nombre");
		System.out.println("7)Mostrar todos los Paises");
		System.out.println("8)Mostrar los destinos turisticos que pertenecen a un Pais");
		System.out.println("9)Salir");
		System.out.println("Ingrese una opcion: ");
		op=sc.nextInt();
		return op;
	}
	
	private static void guardarDestino(ArrayList<DestinoTuristico> destinos, Scanner sc, ArrayList<Pais> paises) {
		String nombre;
		int codigo,op=11,cantidadDias;
		Pais pais;
		double precio;
		try {
		System.out.println("Ingrese codigo del Destino Turistico");
		codigo=sc.nextInt();
		System.out.println("Ingrese nombre del Destino Turistico");
		nombre=sc.next();
		System.out.println("Ingrese precio del Destino Turistico: ");
		precio=sc.nextDouble();
		while(op<1 || op>10) {
			mostrarPaises(paises);
			System.out.println("Ingrese Codigo del Pais rango [1-10]: ");
			op=sc.nextInt();
		}
		pais=seleccionarPais(paises,op);
		System.out.println("Cantidad de Dias: ");
		cantidadDias=sc.nextInt();
		DestinoTuristico destino= new DestinoTuristico(codigo,nombre,precio,pais,cantidadDias);
		destinos.add(destino);
		}catch(InputMismatchException e) {
			System.out.println("Se esperaba que ingrese un numero en los campos : CODIGO,PRECIO,CANTIDAD DE DIAS,CODIGO DEL PAIS");
		}
	}
	
	public static void mostrarPaises(ArrayList<Pais> paises) {
		System.out.println("**************************");
		for(Pais pais : paises) {
			System.out.println("Codigo: "+pais.getCodigo()+" Pais: "+pais.getNombre());
		}
	}
	public static Pais seleccionarPais(ArrayList<Pais> paises, int op) {
		Pais paisSeleccionado=new Pais();
		for(Pais pais : paises) {
			if(pais.getCodigo()==op) {
				paisSeleccionado=pais;
			}
		}
		return paisSeleccionado;
	}
	public static void mostrarDestinos(ArrayList <DestinoTuristico> destinos) {
		for(DestinoTuristico destino: destinos) {
			mostrarDestino(destino);
			}
	}
	public static void mostrarDestino(DestinoTuristico destino) {
		System.out.println("Codigo del Destino: "+destino.getCodigo());
		System.out.println("Destino: "+destino.getNombre());
		System.out.println("Precio: "+destino.getPrecio());
		System.out.println("Nombre del Pais: "+destino.getPais().getNombre());
		System.out.println("Codigo de Pais: "+destino.getPais().getCodigo());
		System.out.println("Cantidad de Dias: "+destino.getCantidadDias());
		System.out.println("************************************************");
	}
	public static void modificarPais(ArrayList <DestinoTuristico> destinos,Scanner sc,ArrayList<Pais> paises) {
		String nombre;
		Pais pais;
		int op=11;
		boolean band=false;
		System.out.println("Ingrese el nombre del Destino Turistico para modificarlo: ");
		nombre=sc.next();
		for(DestinoTuristico destino: destinos) {
			if(destino.getNombre().equals(nombre)) {
				band=true;
				mostrarPaises(paises);
				try {
					while(op<1 || op>10) {
						System.out.println("Ingrese Codigo del Pais: ");
						op=sc.nextInt();
						if(op>10 || op<1) {
							System.out.println("Debe ingresar un numero en el rango [1-10]");
						}
					}
				pais=seleccionarPais(paises,op);
				destino.setPais(pais);
				}catch(InputMismatchException e) {
					System.out.println("Debe ingresar un numero para el codigo del pais");
				}
			}
		}
		if(band==false) {
			System.out.println("No existe ningun destino turistico con ese nombre");
		}
	}
	
	public static void limpiarArray(ArrayList <DestinoTuristico> destinos) {
		destinos.clear();
	}
	public static void eliminarDestino(ArrayList <DestinoTuristico> destinos,Scanner sc) {
		int codigo;
		boolean band=false;
		try {
		System.out.println("Ingrese el codigo del Destino a Eliminar:  ");
		codigo=sc.nextInt();
		Iterator <DestinoTuristico> iterator= destinos.iterator();
		while(iterator.hasNext()) {
			DestinoTuristico d=iterator.next();
			if(d.getCodigo()==codigo) {
				iterator.remove();
				band=true;
			}
		}
		}catch(InputMismatchException e){
			System.out.println("Debe ingresar un numero en el codigo del destino");
		}
		if(band==false) {
			System.out.println("No existe el Destino ingresado");
		}
	}
	
	public static void mostrarDestinosOrdenados(ArrayList <DestinoTuristico> destinos) {
		Collections.sort(destinos, (d1,d2) -> d1.getNombre().compareTo(d2.getNombre()));
		System.out.println("Destinos ordenados por nombre:  ");
		for(DestinoTuristico destino: destinos) {
			mostrarDestino(destino);
		}
	}
	public static void mostrarDestinosPorPais(ArrayList <DestinoTuristico> destinos,ArrayList <Pais> paises,Scanner sc) {
		int codigo;
		boolean band=false;
		mostrarPaises(paises);
		try {
		System.out.println("Ingrese codigo del Pais: ");
		codigo=sc.nextInt();
		for(DestinoTuristico destino : destinos) {
			if(destino.getPais().getCodigo()==codigo) {
				mostrarDestino(destino);
				band=true;
			}
		}
		}catch(InputMismatchException e) {
			System.out.println("Debe ingresar un numero en el area de codigo del pais");
		}
		if(band==false) {
			System.out.println("Ningun destino pertenece a ese codigo de Pais");
		}
	}
}
