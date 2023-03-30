package com.generation.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.generation.ecommerce.repositories.ProductoRepository;
import com.generation.ecommerce.model.Producto;


@Service
public class ProductoService {
	
	@Autowired
	private final ProductoRepository productoRepositoty;
	
	
	
	public ProductoService(ProductoRepository productoRepositoty) {
		this.productoRepositoty = productoRepositoty;
	}

	//Create
	
	public void crearProducto() {
		
	}
	
	//Read
	
	public List<Producto> leerProductos(){
		return productoRepositoty.findAll();
		
	}
	
	public Producto leerProducto(Long prodId) {
		return productoRepositoty.findById(prodId).orElseThrow(()-> new IllegalStateException());
	}
	
	//Update
	public void actualizarProducto() {
		
	}
	
	
	//Delete
	
	public void eliminarProducto() {
		
	}

}
