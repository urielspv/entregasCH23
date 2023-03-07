package com.generation.main;

import com.generation.clases.AreaPerimetro;
import com.generation.clases.FiguraGeometrica;

public class TestAreaPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaPerimetro ap = new AreaPerimetro();
		FiguraGeometrica fg = new FiguraGeometrica();
		
		fg.setArea(ap.areaCuadrado(5));
		System.out.println("Area Cuadrado--->" + ap.areaCuadrado(5));
		
		
		
		

	}

}
