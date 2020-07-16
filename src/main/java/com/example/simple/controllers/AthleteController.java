package com.example.simple.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/athletes")
public class AthleteController {

  @GetMapping
  public String getAllAthletes(){
    return "AthleteController.getAllAthletes - GET";
  }

  @PostMapping
  public String addAthlete() {
    return "AthleteController.addAthlete - POST";
  }

  @GetMapping("/{id}")
  public String getAthlete() {
    return "AthleteController.getAthlete - GET";
  }

  @PutMapping("/{id}")
  public String updateAthlete() {
    return "AthleteController.updateAthlete - PUT";
  }

  @DeleteMapping("/{id}")
  public String deleteAthlete() {
    return "AthleteController.deleteAthlete - DELETE";
  }
}
