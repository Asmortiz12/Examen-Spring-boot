package examen.sebas.c.examenalexanderortiz.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestParam;

import examen.sebas.c.examenalexanderortiz.entity.ProductoAsom;

public interface ProductoAsomRepository extends CrudRepository<ProductoAsom, Long>{
    @Modifying
    @Query("DELETE FROM ProductoAsom a WHERE a.nombre_producto= :nombre_producto")
    void deleteProductoAsomByName(@RequestParam("nombre_producto") String nombre_producto);     
} 
