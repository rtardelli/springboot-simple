package com.example.simple.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tournaments")
public class TournamentController {

  @GetMapping
  public String getAllTournament() {
    return "TournamentController.getAllTournament - GET";
  }

  @PostMapping
  public String addTournament() {
    return "TournamentController.addTournament - POST";
  }

  @GetMapping("/{id}")
  public String getTournament() {
    return "TournamentController.getTournament - GET";
  }

  @PutMapping("/{id}")
  public String updateTournament() {
    return "TournamentController.updateTournament - PUT";
  }

  @DeleteMapping("/{id}")
  public String deleteTournament() {
    return "TournamentController.deleteTournament - DELETE";
  }
}
