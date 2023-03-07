package com.generation.clases;

public class Taco {
	private String tipoDeTortilla;
	private String guisado;
	private int numeroDeTortilla;
	private String tamanioDeTortilla;
	private float precio;
	
	public Taco() {
		
	}
	public Taco(String tipoDeTortilla, String guisado, int numeroDeTortilla, String tamanioDeTortilla, float precio) {
		super();
		this.tipoDeTortilla = tipoDeTortilla;
		this.guisado = guisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanioDeTortilla = tamanioDeTortilla;
		this.precio = precio;
	}
	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}
	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}
	public String getGuisado() {
		return guisado;
	}
	public void setGuisado(String guisado) {
		this.guisado = guisado;
	}
	public int getNumeroDeTortilla() {
		return numeroDeTortilla;
	}
	public void setNumeroDeTortilla(int numeroDeTortilla) {
		this.numeroDeTortilla = numeroDeTortilla;
	}
	public String getTamanioDeTortilla() {
		return tamanioDeTortilla;
	}
	public void setTamanioDeTortilla(String tamanioDeTortilla) {
		this.tamanioDeTortilla = tamanioDeTortilla;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public void preparar() {
		System.out.println("directo al comal...los de  "+guisado);
        
    }
    public void vender() {
    	System.out.println("aqui tiene sus tacos wero .. no trai cambio? ");
        
    }
    public void ponerSalsa() {
    	System.out.println("la verde pica , la roja no");
        
    }
    public void subirPrecio(int aumento) {
    	this.precio = this.precio + aumento;
    	System.out.println("ya subio de precio carnal ahora vale " + this.precio );
        
    }
	
	public String toString() {
		return "El taco es de " + guisado + " con " + numeroDeTortilla +  " tortillas de " + tipoDeTortilla + " " + tamanioDeTortilla + " por tan solo " + precio + " pesitos wero" ;
	}
	
	
	

}
