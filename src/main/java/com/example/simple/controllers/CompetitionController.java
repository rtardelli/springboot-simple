package com.example.simple.controllers;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import com.example.simple.models.Competition;
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
@RequestMapping("/competitions")
public class CompetitionController {

  private static final Logger logger = LoggerFactory.getLogger(CompetitionController.class);

  @GetMapping
  public ResponseEntity all() {

    Competition competition1 = new Competition();
    competition1.setId(1);
    competition1.setName("Competition One");
    competition1.setLocal("Local Blue");
    competition1.setObservation("Observation for competitionOne");
    competition1.setTournamentId(1);
    competition1.setCreatedAt(LocalDateTime.of(2020, 07, 20, 00, 00));
    competition1.setStartedAt(LocalDateTime.of(2020, 07, 18, 14, 00));
    competition1.setStartedAt(LocalDateTime.of(2020, 07, 18, 20, 00));

    Competition competition2 = new Competition();
    competition2.setId(2);
    competition2.setName("Competition Two");
    competition2.setLocal("Local Yellow");
    competition2.setObservation("Observation for competitionTwo");
    competition2.setTournamentId(1);
    competition2.setCreatedAt(LocalDateTime.of(2020, 07, 20, 00, 00));
    competition2.setStartedAt(LocalDateTime.of(2020, 07, 18, 14, 00));
    competition2.setStartedAt(LocalDateTime.of(2020, 07, 18, 20, 00));

    Competition competition3 = new Competition();
    competition3.setId(3);
    competition3.setName("Competition Third");
    competition3.setLocal("Local Blue");
    competition3.setObservation("Observation for competitionThird");
    competition3.setTournamentId(1);
    competition3.setCreatedAt(LocalDateTime.of(2020, 07, 20, 00, 00));
    competition3.setStartedAt(LocalDateTime.of(2020, 07, 18, 14, 00));
    competition3.setStartedAt(LocalDateTime.of(2020, 07, 18, 20, 00));

    List<Competition> list = Arrays.asList(competition1, competition2, competition3);

    return ResponseEntity.ok(list);
  }

  @PostMapping
  public ResponseEntity add(@RequestBody Competition competition) {
    return ResponseEntity.created(URI.create("/competitions/" + competition.getId())).build();
  }

  @GetMapping("/{id}")
  public ResponseEntity one(@PathVariable String competitionId) {
    Competition competition1 = new Competition();
    competition1.setId(Integer.parseInt(competitionId));
    competition1.setName("Competition One");
    competition1.setLocal("Local Blue");
    competition1.setObservation("Observation for competitionOne");
    competition1.setTournamentId(1);
    competition1.setCreatedAt(LocalDateTime.of(2020, 07, 20, 00, 00));
    competition1.setStartedAt(LocalDateTime.of(2020, 07, 18, 14, 00));
    competition1.setStartedAt(LocalDateTime.of(2020, 07, 18, 20, 00));
    return ResponseEntity.ok(competition1);
  }

  @PutMapping("/{id}")
  public ResponseEntity update(@PathVariable String competitionId, @RequestBody Competition competition) {
    competition.setId(Integer.parseInt(competitionId));
    return ResponseEntity.ok(competition);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity delete(@PathVariable String competitionId) {
    return ResponseEntity.noContent().build();
  }
}
