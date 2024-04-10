package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int n;
	
	public CalculadoraEspecial() {
		super();
	}
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public double calcularSumatoria() {
		double sumatoria=0,termino;
		
		for(int k=1;k<=n;k++) {
			termino=Math.pow((k * (k + 1) / 2.0), 2);;
			sumatoria=sumatoria+termino;
		}
		return sumatoria;
	}
	
	public double calcularProductoria() {
		double productoria=1,termino;
		for (int k=1;k<=n;k++){
			termino=k*(k+4);
			productoria=productoria*termino;
		}
		return productoria;
	}
}
