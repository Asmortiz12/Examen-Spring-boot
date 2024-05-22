package examen.sebas.c.examenalexanderortiz.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import examen.sebas.c.examenalexanderortiz.entity.ProductoAsom;
import examen.sebas.c.examenalexanderortiz.repository.ProductoAsomRepository;
import jakarta.transaction.Transactional;

@Service
public class ProductoAsomService {

    @Autowired
    private ProductoAsomRepository productoAsomRepository;

    public ProductoAsom saveAsom(ProductoAsom entity){
        return productoAsomRepository.save(entity);
    }
    public List<ProductoAsom> findAllAsom(){
        return (List<ProductoAsom>) productoAsomRepository.findAll();       
    }
    @Transactional
    public ProductoAsom deleteProductoAsomByName(String nombre_producto){
        productoAsomRepository.deleteProductoAsomByName(nombre_producto);
        return null;
    }



    
}
