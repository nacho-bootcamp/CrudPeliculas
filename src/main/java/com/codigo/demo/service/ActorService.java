package com.codigo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codigo.demo.dao.IActorRepository;
import com.codigo.demo.entities.Actor;

@Service
public class ActorService implements IActorService {

  @Autowired
  private IActorRepository actorRepository;

  @Override
  public List<Actor> findAll() {
    return (List<Actor>) actorRepository.findAll();
  }

  @Override
  public List<Actor> findByAllId(List<Long> ids) {
    return (List<Actor>) actorRepository.findAllById(ids);
  }

}
