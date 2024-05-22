package examen.sebas.c.examenalexanderortiz.controllers;

import org.springframework.web.bind.annotation.RestController;

import examen.sebas.c.examenalexanderortiz.entity.ProductoAsom;
import examen.sebas.c.examenalexanderortiz.services.ProductoAsomService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;






@RestController
@RequestMapping("/productoAsom/Api")
@Tag(name = "Examen Api Alexander Ortiz")
public class ProductoAsomController {

    @Autowired
    private ProductoAsomService productoAsomService;

    @PostMapping("/postProductos")
    @Operation(summary = "Crear un Producto")

    public ProductoAsom saveAsom(@RequestBody ProductoAsom entity) {
       return productoAsomService.saveAsom(entity);
    }

    @GetMapping("getProductos")
    @Operation(summary = "LLamar a todos los Producto")

    public List<ProductoAsom> findAllAsom() {
        return productoAsomService.findAllAsom();
    }

    @DeleteMapping("/{nombre_producto}")
    @Operation(summary = "Eliminar los productos por el nombre")
    public ProductoAsom deleteProductoAsomByName(@PathVariable("nombre_producto") String nombre_producto){
        return productoAsomService.deleteProductoAsomByName(nombre_producto);
    }

    
    


    
}
