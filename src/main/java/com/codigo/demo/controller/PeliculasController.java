package com.codigo.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codigo.demo.entities.Pelicula;
import com.codigo.demo.service.IActorService;
import com.codigo.demo.service.IGeneroService;
import com.codigo.demo.service.IPeliculaService;

@Controller
public class PeliculasController {

  @Autowired
  private IPeliculaService service;
  @Autowired
  private IGeneroService generoService;
  @Autowired
  private IActorService actorService;

  @GetMapping("/pelicula")
  public String crear(Model model) {
    Pelicula pelicula = new Pelicula();
    model.addAttribute("pelicula", pelicula);
    model.addAttribute("titulo", "Nueva Pelicula");
    model.addAttribute("generos", generoService.findAll());
    model.addAttribute("actores", actorService.findAll());
    return "pelicula";
  }

  @GetMapping("pelicula/{id}")
  public String editar(@PathVariable() Long id, Model model) {
    Pelicula pelicula = new Pelicula();
    model.addAttribute("pelicula", pelicula);
    model.addAttribute("generos", generoService.findAll());
    model.addAttribute("actores", actorService.findAll());
    model.addAttribute("titulo", "Nueva Pelicula");
    return "pelicula";
  }

  @PostMapping("/pelicula")
  public String guardar(Pelicula pelicula, @ModelAttribute(name = "ids") String ids) {

    List<Long> idsProtagonistas = Arrays.stream(ids.split(",")).map(Long::parseLong).collect(Collectors.toList());
    pelicula.setProtagonistas(actorService.findByAllId(idsProtagonistas));
    service.save(pelicula);
    return "redirect:home";
  }

  @GetMapping({ "/", "/home", "/index " })
  public String home() {
    return "home";
  }

}
