package com.generation.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.generation.ecommerce.repositories.ProductoRepository;
import com.generation.ecommerce.model.Producto;


@Service
public class ProductoService {
	
	@Autowired
	private final ProductoRepository productoRepositoty;
	
	
	//Constructors
	public ProductoService(ProductoRepository productoRepositoty) {
		this.productoRepositoty = productoRepositoty;
	}

	
	//Create
	public void crearProducto(Producto product) {
		
		Optional <Producto> busqueda = productoRepositoty.findByNombre(product.getNombre());
		
		if(busqueda.isPresent()) {
			throw new IllegalStateException("El producto con el nombre" + product.getNombre() + "ya existe");
		}
		else {
			productoRepositoty.save(product);
			
		}
		
	}
	
	//Read
	
	public List<Producto> leerProductos(){
		return productoRepositoty.findAll();
		
	}
	
	public Producto leerProducto(Long prodId) {
		return productoRepositoty.findById(prodId).orElseThrow(()-> new IllegalStateException());
	}
	
	//Update para actualizar un producto
    public void actualizarProducto(Long prodId, String nombre, String descripcion, String URL_Imagen, double precio) {
        
        //si el producto existe...
        if(productoRepositoty.existsById(prodId)) {
            //entonces lo modifico
            Producto productoABuscar = productoRepositoty.getById(prodId) ;//ya que verifico que mi producto existe, lo traigo y lo asigno a una variable llamada productoABuscar
            if (nombre!= null) productoABuscar.setNombre(nombre);
            if (descripcion!= null) productoABuscar.setDescripcion(descripcion);
            if (precio!= 0) productoABuscar.setPrecio(precio);
            if (URL_Imagen!= null) productoABuscar.setURL_Imagen(URL_Imagen);
            productoRepositoty.save(productoABuscar);
            
        }
        else {
        	System.out.println("El producto no se ecnotró");
        	
        
        
    }
		
		
		
		
	}
	
	
	//Delete
	
	public void eliminarProducto(Long prodId) {
		if (productoRepositoty.existsById(prodId)) {
			productoRepositoty.deleteById(prodId);
		}
		
	}

}
