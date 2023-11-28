package com.codigo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codigo.demo.entities.Genero;
import com.codigo.demo.service.IGeneroService;

@RestController
public class GeneroController {
  @Autowired
  private IGeneroService generoService;

  @PostMapping("genero")
  public Long guardar(@RequestParam String nombre) {
    Genero genero = new Genero();
    genero.setNombre(nombre);
    generoService.save(genero);
    return genero.getId();
  }

  @GetMapping("genero/{id}")
  public String buscarPorId(@PathVariable(name = "id") Long id) {
    return generoService.findById(id).getNombre();
  }
}
