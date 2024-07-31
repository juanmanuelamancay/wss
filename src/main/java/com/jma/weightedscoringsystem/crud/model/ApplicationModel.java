package com.jma.weightedscoringsystem.crud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "application")
public class ApplicationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String service;
    private String name;
    private Boolean moneyHandling;
    private Boolean local;
    private Integer Complexity;
    private Integer score;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getComplexity() {
        return Complexity;
    }

    public void setComplexity(Integer complexity) {
        Complexity = complexity;
    }

    public Boolean getLocal() {
        return local;
    }

    public void setLocal(Boolean local) {
        this.local = local;
    }

    public Boolean getMoneyHandling() {
        return moneyHandling;
    }

    public void setMoneyHandling(Boolean moneyHandling) {
        this.moneyHandling = moneyHandling;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
