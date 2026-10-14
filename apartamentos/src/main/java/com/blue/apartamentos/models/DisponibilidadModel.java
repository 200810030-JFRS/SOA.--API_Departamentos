package com.blue.apartamentos.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "disponibilidades")
public class DisponibilidadModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_disponibilidad;

    // Agregar la relación con PropiedadModel
    //private Long id_propiedad;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDateTime fecha_inicio;

    @Column(name = "fecha_fin", nullable = false)
    private LocalDateTime fecha_fin;
    
    @Column(name = "disponible", nullable = false)
    private Boolean disponible;
    
    @Column(name = "precio_especial")
    private Double precio_especial;
    
    // Getters y Setters
    // Constructores
    // Otros métodos según sea necesario
}
