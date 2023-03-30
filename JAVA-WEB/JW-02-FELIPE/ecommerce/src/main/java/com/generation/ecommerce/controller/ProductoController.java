package com.generation.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.services.ProductoService;


@RestController
@RequestMapping(path = "/miOtzo/productos/") //indica la ruta o Url de nuestro endpoint para saber donde se manejan nuestras solicitudes
public class ProductoController {
	
	//Instancia de la clase "ProductoService"
	
	
	@Autowired
	private final ProductoService productoServicio;
	
	public ProductoController(ProductoService nombreServicio) {
		this.productoServicio = nombreServicio;
	}

	@GetMapping
	public List<Producto>  getProducto() {
		return productoServicio.leerProductos();
		
	}
	
//	@PostMapping
//	
//	public  postProducto() {
//		return productoServicio.crearProducto();
//		
//	}
//	
//	@PutMapping
//	
//	public  putProducto() {
//		return productoServicio.actualizarProducto();
//		
//	}
//	
//	@DeleteMapping
//	
//	public  deleteProducto() {
//		return productoServicio.eliminarProducto();
//		
//	}

}
