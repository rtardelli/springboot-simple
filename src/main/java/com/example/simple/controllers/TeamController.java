package com.example.simple.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teams")
public class TeamController {

  @GetMapping()
  public String getAllTeams() {
    return "TeamController.getAllTeams - GET";
  }

  @PostMapping()
  public String addTeam() {
    return "TeamController.addTeam - POST";
  }

  @GetMapping("/{id}")
  public String getTeam() {
    return "TeamController.getTeam - GET";
  }

  @PutMapping("/{id}")
  public String updateTeam() {
    return "TeamController.updateTeam - PUT";
  }

  @DeleteMapping("/{id}")
  public String deleteTeam() {
    return "TeamController.deleteTeam - DELETE";
  }
}
