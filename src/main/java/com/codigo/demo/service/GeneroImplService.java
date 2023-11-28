package com.codigo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codigo.demo.dao.IGeneroRepository;
import com.codigo.demo.entities.Genero;

@Service
public class GeneroImplService implements IGeneroService {

  @Autowired
  public IGeneroRepository generoRepository;

  @Override
  public void save(Genero genero) {
    generoRepository.save(genero);
  }

  @Override
  public Genero findById(Long id) {
    return generoRepository.findById(id).orElse(null);
  }

  @Override
  public void delete(Long id) {
    generoRepository.deleteById(id);
  }

  @Override
  public List<Genero> findAll() {
    return (List<Genero>) generoRepository.findAll();
  }

}
