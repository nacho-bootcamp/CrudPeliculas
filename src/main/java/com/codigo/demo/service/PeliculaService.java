package com.codigo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codigo.demo.dao.IPeliculasRepository;
import com.codigo.demo.entities.Pelicula;

@Service
public class PeliculaService implements IPeliculaService {
  @Autowired
  private IPeliculasRepository peliculasRepository;

  @Override
  public void save(Pelicula pelicula) {
    peliculasRepository.save(pelicula);
  }

  @Override
  public Pelicula findById(Long id) {
    return peliculasRepository.findById(id).orElse(null);
  }

  @Override
  public List<Pelicula> findByAll() {
    return (List<Pelicula>) peliculasRepository.findAll();
  }

  @Override
  public void delete(Long id) {
    peliculasRepository.deleteById(id);
  }

}
