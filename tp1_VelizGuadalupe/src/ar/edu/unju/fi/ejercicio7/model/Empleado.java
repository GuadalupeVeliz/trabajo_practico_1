package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private int legajo;
	private Double salario;
	private final Double SALARIO_MINIMO=210000.00;
	private final Double AUMENTO=20000.00;
	
	public Empleado(String nombre, int legajo, Double salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		if(salario>=SALARIO_MINIMO) {
			this.salario = salario;
		}else{
			this.salario=SALARIO_MINIMO;
		}
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre del Empleado: "+this.nombre);
		System.out.println("Legajo: "+this.legajo);
		System.out.println("Salario: $"+this.salario);
	}
	public void aumentarSalario() {
		this.salario=this.salario+AUMENTO;
	}
	
}
