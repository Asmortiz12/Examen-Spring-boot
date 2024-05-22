package examen.sebas.c.examenalexanderortiz.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "producto")
//Asom es por Alexander Sebastian Ortiz Martinez
public class ProductoAsom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_producto;
    private String nombre_producto;
    private Boolean estado_producto;
    private LocalDate fecha_registro;
    private float precio_venta;
    
}
