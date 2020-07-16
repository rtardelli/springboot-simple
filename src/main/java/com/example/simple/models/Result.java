package com.example.simple.models;

import java.time.LocalDateTime;

public class Result {

  private long id;
  private int competitorId;
  private int qtd;
  private int weight;
  private LocalDateTime updatedAt;
  private int competitionId;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getCompetitorId() {
    return competitorId;
  }

  public void setCompetitorId(int competitorId) {
    this.competitorId = competitorId;
  }

  public int getQtd() {
    return qtd;
  }

  public void setQtd(int qtd) {
    this.qtd = qtd;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public int getCompetitionId() {
    return competitionId;
  }

  public void setCompetitionId(int competitionId) {
    this.competitionId = competitionId;
  }
}
