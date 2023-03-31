package com.generation.ecommerce.repositories;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.generation.ecommerce.model.Producto;


//Indicamos que extendemos 
public interface ProductoRepository extends JpaRepository<Producto, Long>{
	
	//Esta anotacion nos indica que podemos realizar una consulta personalizada a ala base de datos
	
	@Query("SELECT p From Producto p WHERE p.nombre=?1")
	
	//Metodo que realiza la consulta personalizadda definida anteriormente. Rerorna un Optional que puede contener...
	Optional<Producto> findByNombre(String Nombre);
	
	
	
	
	
}
