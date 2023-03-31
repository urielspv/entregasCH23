package com.generation.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.services.ProductoService;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,RequestMethod.PUT })
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
	
	@GetMapping(path = "{prodId}")
	public Producto getProducto(@PathVariable("prodId") Long prodId) {
		return productoServicio.leerProducto(prodId);
	}
	
	@PostMapping
	public void  postProducto(@RequestBody Producto prod) {
		 productoServicio.crearProducto(prod);
	}
	
	//HTTP PUT
	@PutMapping (path=" {prodId}")
	public void updateProducto(@PathVariable("prodId") Long prodId,
	@RequestParam(required=false) String nombre,
	@RequestParam(required=false) String descripcion,
	@RequestParam (required=false) double precio,
	@RequestParam(required=false) String url_Imagen) {
	productoServicio.actualizarProducto(prodId, nombre, descripcion,
	url_Imagen, precio);
	} //updateProducto
	
	@DeleteMapping( path = "{prodId}")
	
	public void  deleteProducto(@PathVariable("prodId")Long prodId) {
		 productoServicio.eliminarProducto(prodId);
		
	}

}
