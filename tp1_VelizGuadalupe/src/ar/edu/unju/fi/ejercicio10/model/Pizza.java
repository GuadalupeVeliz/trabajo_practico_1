package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private Double diametro;
	private Double precio;
	private Double area;
	private boolean ingredientesEspeciales;
	private final int INGREDIENTES_ESPECIALES20=500;
	private final int INGREDIENTES_ESPECIALES30=750;
	private final int INGREDIENTES_ESPECIALES40=1000;
	
	public Double getDiametro() {
		return diametro;
	}
	public void setDiametro(Double diametro) {
		this.diametro = diametro;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}
	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
	public int getINGREDIENTES_ESPECIALES20() {
		return INGREDIENTES_ESPECIALES20;
	}
	public int getINGREDIENTES_ESPECIALES30() {
		return INGREDIENTES_ESPECIALES30;
	}
	public int getINGREDIENTES_ESPECIALES40() {
		return INGREDIENTES_ESPECIALES40;
	}
	public Pizza() {
		super();
	}
	
	public double calcularPrecio(double diametro,boolean ingredientesEspeciales) {
		if(diametro == 20 && ingredientesEspeciales== false) {
			precio=4500.0;
		}else if(diametro == 20 && ingredientesEspeciales== true){
			precio=4500.0+ INGREDIENTES_ESPECIALES20;
		} else if(diametro == 30 && ingredientesEspeciales== false) {
			precio=4800.0;
		}else if(diametro == 30 && ingredientesEspeciales== true){
			precio=4800.0+ INGREDIENTES_ESPECIALES30;
		}else if(diametro == 40 && ingredientesEspeciales== false) {
			precio=5500.0;
		}else if(diametro == 40 && ingredientesEspeciales== true){
			precio=5500.0+ INGREDIENTES_ESPECIALES40;
		} 
		return precio;
	}
	
	public void calcularArea() {
		double radio,area;
		radio=diametro/2;
		area=Math.PI*(Math.pow(radio,2));
		this.area=area;
	}
	
}
