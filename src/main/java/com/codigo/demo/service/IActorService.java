package com.codigo.demo.service;

import java.util.List;

import com.codigo.demo.entities.Actor;

public interface IActorService {

  public List<Actor> findAll();

  public List<Actor> findByAllId(List<Long> ids);

}
