package com.example.simple.controllers;

import java.net.URI;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.example.simple.models.Athlete;
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
@RequestMapping("/athletes")
public class AthleteController {

  private static final Logger logger = LoggerFactory.getLogger(AthleteController.class);

  @GetMapping
  public ResponseEntity all(){
    Athlete athlete1 = new Athlete();
    athlete1.setId(1);
    athlete1.setName("Athlete One");
    athlete1.setBirthday(LocalDate.now());

    Athlete athlete2 = new Athlete();
    athlete2.setId(2);
    athlete2.setName("Athlete Two");
    athlete2.setBirthday(LocalDate.now());

    Athlete athlete3 = new Athlete();
    athlete3.setId(3);
    athlete3.setName("Athlete Third");
    athlete3.setBirthday(LocalDate.now());

    List<Athlete> list = Arrays.asList(athlete1, athlete2, athlete3);

    return ResponseEntity.ok(list);
  }

  @PostMapping
  public ResponseEntity add(@RequestBody Athlete athlete) {
    return ResponseEntity.created(URI.create("/athletes/" + athlete.getId())).build();
  }

  @GetMapping("/{id}")
  public ResponseEntity one(@PathVariable String athleteId) {
    Athlete athlete1 = new Athlete();
    athlete1.setId(Integer.parseInt(athleteId));
    athlete1.setName("Athlete One");
    athlete1.setBirthday(LocalDate.now());

    return ResponseEntity.ok(athlete1);
  }

  @PutMapping("/{id}")
  public ResponseEntity update(@PathVariable String athleteId, @RequestBody Athlete athlete) {
    athlete.setId(Integer.parseInt(athleteId));
    return ResponseEntity.ok(athlete);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity delete(@PathVariable String athleteId) {
    return ResponseEntity.noContent().build();
  }
}
