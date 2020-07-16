package com.example.simple.controllers;

import java.util.Arrays;
import java.util.List;

import com.example.simple.models.Team;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teams")
public class TeamController {

  @GetMapping()
  public List<Team> getAllTeams() {
    Team t1 = new Team();
    t1.setId(1);
    t1.setName("Team One");

    Team t2 = new Team();
    t2.setId(2);
    t2.setName("Team Two");

    return Arrays.asList(t1, t2);
  }

  @PostMapping()
  public Team addTeam(@RequestBody Team team) {
    return team;
  }

  @GetMapping("/{id}")
  public Team getTeam(@PathVariable("id") String teamId) {
    Team t1 = new Team();
    t1.setId(Integer.parseInt(teamId));
    t1.setName("Team One");

    return t1;
  }

  @PutMapping("/{id}")
  public Team updateTeam(@PathVariable("id") String teamId, @RequestBody Team team) {
    team.setId(Integer.parseInt(teamId));

    return team;
  }

  @DeleteMapping("/{id}")
  public void deleteTeam(@PathVariable("id") String teamId) {
  }
}
