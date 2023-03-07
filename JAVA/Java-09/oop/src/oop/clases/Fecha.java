package oop.clases;
public class Fecha extends Object {
    private int dia;
    private int mes; 
    private int ano;
    

    public Fecha() {
        super();
    }

    public Fecha(int dia, int mes, int ano) {
        super();
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
public String diaMesAno() {
    return "La fecha es: --> " + this.dia + " / " + this.mes + " / " + this.ano;
}


@Override
public String toString() {
	return "Fecha [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
}

public int getDia() {
    return dia;
}
public void setDia(int dia) {
    this.dia = dia;
}
public int getMes() {
    return mes;
}
public void setMes(int mes) {
    this.mes = mes;
}
public int getAño() {
    return ano;
}
public void setAno(int ano) {
    this.ano = ano;
}
}

