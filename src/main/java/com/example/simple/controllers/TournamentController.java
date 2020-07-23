package com.example.simple.controllers;

import java.net.URI;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.example.simple.models.Tournament;
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
@RequestMapping("/tournaments")
public class TournamentController {

  private static final Logger logger = LoggerFactory.getLogger(TournamentController.class);

  @GetMapping
  public ResponseEntity<List<Tournament>> all() {

    Tournament tournament1 = new Tournament();
    tournament1.setId(1);
    tournament1.setName("Tournament 2020");
    tournament1.setCreatedAt(LocalDate.parse("2020-01-01"));

    Tournament tournament2 = new Tournament();
    tournament2.setId(2);
    tournament2.setName("Tournament 2019");
    tournament2.setCreatedAt(LocalDate.parse("2019-01-01"));

    Tournament tournament3 = new Tournament();
    tournament3.setId(3);
    tournament3.setName("Tournament 2018");
    tournament3.setCreatedAt(LocalDate.parse("2018-01-01"));

    List<Tournament> list = Arrays.asList(tournament1, tournament2, tournament3);

    return ResponseEntity.ok(list);
  }

  @PostMapping
  public ResponseEntity add(@RequestBody Tournament tournament) {
    return ResponseEntity.created(URI.create("/tournaments/" + tournament.getId())).build();
  }

  @GetMapping("/{id}")
  public ResponseEntity one(@PathVariable String tournamentId) {
    Tournament tournament1 = new Tournament();
    tournament1.setId(1);
    tournament1.setName("Tournament 2020");
    tournament1.setCreatedAt(LocalDate.parse("2020-01-01"));

    return ResponseEntity.ok(tournament1);
  }

  @PutMapping("/{id}")
  public ResponseEntity update(@PathVariable String tournamentId, @RequestBody Tournament tournament) {
    tournament.setId(Integer.parseInt(tournamentId));

    return ResponseEntity.ok(tournament);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity delete(@PathVariable String tournamentId) {
    return ResponseEntity.noContent().build();
  }
}
