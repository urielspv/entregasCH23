package com.generation.cohorte23.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.generation.cohorte23.models.Libro;

@Repository
public class LibrosRepositorio {
	public List<Libro> listar(){
		
		List<Libro> lista = new ArrayList<Libro>();
		lista.add(new Libro("Spring Boot" , "Luis" , "1"));
		lista.add(new Libro("Java" , "Pedro" , "2"));
		lista.add(new Libro("El lenguaje C++" , "Richi Pérez" , "3"));
		return lista;
		
	}

}
