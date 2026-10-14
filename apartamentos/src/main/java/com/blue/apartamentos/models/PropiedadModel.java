package com.blue.apartamentos.models;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "propiedades")
public class PropiedadModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_propiedad")
    private Long id;

    @Column(name = "direccion", nullable = false, length = 150)
    @JsonProperty("direccion")
    private String direccion;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false)
    @JsonProperty("tipo")
    private TipoPropiedad tipo;

    @Column(name = "precio_noche", nullable = false, precision = 10, scale = 2)
    @JsonProperty("precio_noche")
    @JsonAlias("precioNoche")
    private BigDecimal precioNoche;

    public enum TipoPropiedad {
        APARTAMENTO,
        CASA,
        ESTUDIO,
        PENTHOUSE,
        HABITACION
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TipoPropiedad getTipo() {
        return tipo;
    }

    public void setTipo(TipoPropiedad tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(BigDecimal precioNoche) {
        this.precioNoche = precioNoche;
    }

    // Constructores
    public PropiedadModel() {
    }

    public PropiedadModel(Long id, String direccion, TipoPropiedad tipo, BigDecimal precioNoche) {
        this.id = id;
        this.direccion = direccion;
        this.tipo = tipo;
        this.precioNoche = precioNoche;
    }

    public PropiedadModel(String direccion, TipoPropiedad tipo, BigDecimal precioNoche) {
        this.direccion = direccion;
        this.tipo = tipo;
        this.precioNoche = precioNoche;
    }
}