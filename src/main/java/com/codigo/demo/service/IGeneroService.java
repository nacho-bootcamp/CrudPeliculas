package com.codigo.demo.service;

import java.util.List;

import com.codigo.demo.entities.Genero;

public interface IGeneroService {
  public void save(Genero genero);

  public Genero findById(Long id);

  public void delete(Long id);

  public List<Genero> findAll();
}
