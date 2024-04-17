package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList <Jugador> jugadores = new ArrayList<>();
		int op=1;
		while(op!=8) {
			op=menu(sc);
			switch(op) {
			case 1:
				guardarJugador(jugadores,sc);
				break;
			case 2: 
				mostrarJugador(jugadores,sc);
				break;
			case 3: 
				mostrarJugadoresOrdenado(jugadores);
				break;
			case 4: 
				modificarDatos(jugadores,sc);
				break;
			case 5: 
				eliminarJugador(jugadores,sc);
				break;
			case 6:
				mostrarCantidadTotal(jugadores);
				break;
			case 7:
				mostrarCantidadPorNacionalidad(jugadores,sc);
				break;
			case 8: 
				System.out.println("Fin del menu :)");
				break;
			default:
				System.out.println("El numero ingresado no es valido");
			}
		}
		sc.close();
	}

	
	public static int menu(Scanner sc) {
		int opcion=9;
		System.out.println("*********** Menu *******");
		System.out.println("1) Alta de jugador");
		System.out.println("2) Mostrar los datos del jugador (el usuario debe ingresar el nombre y el apellido)");
		System.out.println("3) Mostrar todos los jugadores ordenados por apellido.");
		System.out.println("4) Modificar los datos de un jugador");
		System.out.println("5) Eliminar un jugador");
		System.out.println("6) Mostrar la cantidad total de jugadores que tiene el ArrayList.");
		System.out.println("7)  Mostrar la cantidad de jugadores que pertenecen a una nacionalidad ");
		System.out.println("8)Salir");
		try {
			opcion=sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("ERROR se esperaba que ingrese un numero entero");
			sc.nextLine();
		}
		return opcion;
	}
	public static void guardarJugador(ArrayList <Jugador>jugadores,Scanner sc) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String nombre,apellido,nacionalidad,posicion="",fecha;
		int op;
		float estatura,peso;
		try {
		System.out.println("Ingrese nombre: ");
		nombre=sc.next();
		System.out.println("Ingrese Apellido: ");
		apellido=sc.next();
		System.out.println("Ingrese fecha de nacimiento dia/mes/año:  ");
		fecha=sc.next();
		System.out.println("Ingrese Nacionalidad: ");
		nacionalidad=sc.next();
		System.out.println("Ingrese estatura: ");
		estatura=sc.nextFloat();
		System.out.println("Ingrese peso: ");
		peso=sc.nextFloat();
		do {
		op=posicion(sc);
		switch(op){
		case 1:
			posicion="Delantero";
			break;
		case 2: 
			posicion= "Medio";
			break;
		case 3:
			posicion="Defensa";
			break;
		case 4:
			posicion="Arquero";
			break;
		default:
			System.out.println("Debe ingresar un numero en el rango [1-4]");
		}
		}while(op<1 || op>4);
		Jugador jugador=new Jugador(nombre,apellido,LocalDate.parse(fecha,formatter),nacionalidad,estatura,peso,posicion);
		jugadores.add(jugador);
		}catch(InputMismatchException e) {
			System.out.println("ERROR: se esperaba que ingrese un numero en los campos estatura o peso");
			sc.nextLine();
		}catch(DateTimeParseException e) {
	    	System.out.println("ERROR: Debe ingresar numeros en el campo de fecha");
	    }
		
	}
	public static int posicion(Scanner sc) {
		int op=7;
		System.out.println("Posicion: ");
		System.out.println("1)Delantero");
		System.out.println("2)Medio");
		System.out.println("3)Defensa");
		System.out.println("4)Arquero");
		try {
		op=sc.nextInt();
		}catch (InputMismatchException e) {
			System.out.println("ERROR se esperaba que ingrese un numero entero");
			sc.nextLine();
		}
		return op;
	}
	public static void mostrarJugador(ArrayList<Jugador> jugadores, Scanner sc) {
		String nombre,apellido;
		boolean band=false;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Ingrese nombre: ");
		nombre=sc.next();
		System.out.println("Ingrese apellido: ");
		apellido=sc.next();
		for(Jugador jugador : jugadores) {
			if(jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
					band=true;
					System.out.println("Datos del jugador: ");
					System.out.println("Fecha de nacimiento: "+jugador.getFechaNacimiento().format(formatter));
					System.out.println("Edad: "+jugador.calcularEdad());
					System.out.println("Nacionalidad: "+jugador.getNacionalidad());
					System.out.println("Estatura: "+jugador.getEstatura());
					System.out.println("Peso: "+jugador.getPeso());
					System.out.println("Posicion: "+jugador.getPosicion());
					
			}
		}
		if(band==false) {
			System.out.println("No existe un jugador registrado con ese nombre y apellido");
		}
	}
	
	public static void mostrarJugadoresOrdenado(ArrayList<Jugador> jugadores) {
		Collections.sort(jugadores, (j1,j2) -> j1.getApellido().compareTo(j2.getApellido()));
		System.out.println("Jugadores orednados por apellido: ");
		for(Jugador jugador: jugadores) {
			System.out.println(jugador.getApellido()+" "+ jugador.getNombre());
		}
	}
	
	public static void modificarDatos(ArrayList<Jugador> jugadores,Scanner sc) {
		String nombre,apellido,nacionalidad,posicion,fecha;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		int op;
		float estatura,peso;
		boolean band=false;
		System.out.println("Ingrese nombre: ");
		nombre=sc.next();
		System.out.println("Ingrese apellido: ");
		apellido=sc.next();
		for(Jugador jugador : jugadores) {
			if(jugador.getNombre().equals(nombre)) {
				if(jugador.getApellido().equals(apellido)) {
					band=true;
					menuModificar();
					try {
					op=sc.nextInt();
					switch(op) {
					case 1:
						System.out.println("Ingrese nueva fecha de nacimiento: (dia/mes/año)");
						fecha=sc.next();
						jugador.setFechaNacimiento(LocalDate.parse(fecha,formatter));
						break;
					case 2:
						System.out.println("Ingrese nueva Nacionalidad: ");
						nacionalidad=sc.next();
						jugador.setNacionalidad(nacionalidad);
						break;
					case 3:
						System.out.println("Ingrese nueva estatura");
						estatura=sc.nextFloat();
						jugador.setEstatura(estatura);
						break;
					case 4:
						System.out.println("Ingrese nuevo peso: ");
						peso=sc.nextFloat();
						jugador.setPeso(peso);
						break;
					case 5:
						System.out.println("Ingrese nueva posicion: ");
						posicion=sc.next();
						jugador.setPosicion(posicion);
						break;
					case 6:
						System.out.println("Se cancelo la modificacion");
						break;
					default:
						System.out.println("Opcion ingresada NO valida");
					}
					}catch(InputMismatchException e) {
						System.out.println("ERROR se esperaba que ingrese un numero entero");
						sc.nextLine();
					}
				}
			}
		}
		if(band==false) {
			System.out.println("No existe un jugador registrado con ese nombre y apellido");
		}
	}
	
	public static void menuModificar() {
		System.out.println("*********Modificar**********");
		System.out.println("1)Fecha de nacimiento");
		System.out.println("2)Nacionalidad");
		System.out.println("3)Estatura");
		System.out.println("4)Peso");
		System.out.println("5)Posicion");
		System.out.println("6)Cancelar");
		System.out.println("Ingresar Opcion: ");
	}
	
	public static void eliminarJugador(ArrayList<Jugador> jugadores, Scanner sc) {
		String nombre,apellido;
		boolean band=false;
		System.out.println("Ingrese nombre: ");
		nombre=sc.next();
		System.out.println("Ingrese apellido: ");
		apellido=sc.next();
		Iterator <Jugador> iterator =jugadores.iterator();
		while(iterator.hasNext()) {
			Jugador j= iterator.next();
			if(j.getNombre().equals(nombre) && j.getApellido().equals(apellido)) {
				iterator.remove();
				band=true;
			}
		}
		if(band==false) {
			System.out.println("No existe un jugador registrado con ese nombre y apellido");
		}
	}
	public static void mostrarCantidadTotal(ArrayList<Jugador> jugadores) {
		System.out.println("Cantidad total de Jugadores: "+jugadores.size());
	}
	
	public static void mostrarCantidadPorNacionalidad(ArrayList<Jugador> jugadores,Scanner sc) {
		int cantidad=0;
		String nacionalidad;
		System.out.println("Ingrese nacionalidad: ");
		nacionalidad=sc.next();
		for(Jugador jugador: jugadores) {
			if(jugador.getNacionalidad().equals(nacionalidad)) {
				cantidad++;
			}
		}
		System.out.println("Cantidad de jugadores con nacionalidad "+nacionalidad+ ": "+cantidad);
	}

}
