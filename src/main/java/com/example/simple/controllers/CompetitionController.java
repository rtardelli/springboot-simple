package com.example.simple.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/competitions")
public class CompetitionController {

  @GetMapping
  public String getAllCompetitions() {
    return "CompetitionController.getAllCompetitions - GET";
  }

  @PostMapping
  public String addCompetition() {
    return "CompetitionController.addCompetition - POST";
  }

  @GetMapping("/{id}")
  public String getCompetition() {
    return "CompetitionController.getCompetition - GET";
  }

  @PutMapping("/{id}")
  public String updateCompetition() {
    return "CompetitionController.updateCompetition - PUT";
  }

  @DeleteMapping("/{id}")
  public String deleteCompetition() {
    return "CompetitionController.deleteCompetition - DELETE";
  }
}
