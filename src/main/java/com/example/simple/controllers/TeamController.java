package com.example.simple.controllers;

import java.net.URI;
import java.util.Arrays;

import com.example.simple.models.Team;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
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

  private static final Logger logger = LoggerFactory.getLogger(TeamController.class);

  @GetMapping()
  public ResponseEntity all() {
    Team t1 = new Team();
    t1.setId(1);
    t1.setName("Team One");

    Team t2 = new Team();
    t2.setId(2);
    t2.setName("Team Two");

    return ResponseEntity.ok().body(Arrays.asList(t1, t2));
  }

  @PostMapping()
  public ResponseEntity add(@RequestBody Team team) {
    return ResponseEntity.created(URI.create("/teams/" + team.getId())).build();
  }

  @GetMapping("/{id}")
  public ResponseEntity one(@PathVariable("id") String teamId) {
    Team t1 = new Team();
    t1.setId(Integer.parseInt(teamId));
    t1.setName("Team One");

    return ResponseEntity.created(URI.create("/teams/" + teamId)).body(t1);
  }

  @PutMapping("/{id}")
  public ResponseEntity update(@PathVariable("id") String teamId, @RequestBody Team team) {
    team.setId(Integer.parseInt(teamId));

    return ResponseEntity.ok().body(team);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity delete(@PathVariable("id") String teamId) {

    return ResponseEntity.noContent().build();
  }
}
