package oop.clases;
public class Persona {
    public String nombre = "Juan";
    private int edad;
    private double altura;
    private double peso;
    private String zodiaco;
    
    public Persona() {
        
    }
    
    public String datosPersona() {
        return this.nombre +", "+ this.edad+", "+this.altura+", "+this.peso+", "+this.zodiaco;
    }
    
    public Persona(String nombre) {
        
        this.nombre = nombre; 
    }
    
    public Persona(int edad, String zodiaco) {
        super();
        this.edad = edad;
        this.zodiaco = zodiaco;
    }
    //Aqui va el otro contructor :u
    
    public Persona(String nombre, int edad, double altura, double peso, String zodiaco) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.zodiaco = zodiaco;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getZodiaco() {
        return zodiaco;
    }
    public void setZodiaco(String zodiaco) {
        this.zodiaco = zodiaco;
    }
    
}