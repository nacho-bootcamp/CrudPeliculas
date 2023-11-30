package com.codigo.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.codigo.demo.entities.Pelicula;

public interface IPeliculasRepository extends CrudRepository<Pelicula, Long> {

}
