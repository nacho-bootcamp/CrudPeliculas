package com.codigo.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.codigo.demo.entities.Actor;

public interface IActorRepository extends CrudRepository<Actor, Long> {

}
