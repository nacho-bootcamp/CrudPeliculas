package com.codigo.demo.entities;

import java.io.Serializable;
import java.util.Date;
// import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "peliculas")
public class Pelicula implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;
  private String nombre;
  @Column(name = "fecha_de_estreno")
  @Temporal(TemporalType.DATE)
  private Date fechaEstreno;
  private Genero genero;
  // private List<Actor> protagonistas;

}
