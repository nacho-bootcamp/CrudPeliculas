package com.codigo.demo.service;

import java.util.List;

import com.codigo.demo.entities.Pelicula;

public interface IPeliculaService {
  public void save(Pelicula pelicula);

  public Pelicula findById(Long id);

  public List<Pelicula> findByAll();

  public void delete(Long id);
}
