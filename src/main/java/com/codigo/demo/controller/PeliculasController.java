package com.codigo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codigo.demo.entities.Pelicula;
import com.codigo.demo.service.IPeliculaService;

@Controller
public class PeliculasController {

  @Autowired
  private IPeliculaService service;

  @GetMapping("pelicula")
  public String crear(Model model) {
    Pelicula pelicula = new Pelicula();
    model.addAttribute("pelicula", pelicula);
    model.addAttribute("titulo", "Nueva Pelicula");
    return "pelicula";
  }

  @GetMapping("pelicula/{id}")
  public String editar(@PathVariable() Long id, Model model) {
    Pelicula pelicula = new Pelicula();
    model.addAttribute("pelicula", pelicula);
    model.addAttribute("titulo", "Nueva Pelicula");
    return "pelicula";
  }

}
