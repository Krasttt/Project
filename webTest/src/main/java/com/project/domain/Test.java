package com.project.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Test {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private Integer amountQuestions;

    public Test() {
    }

    public Test(String name, Integer amountQuestions) {
        this.name = name;
        this.amountQuestions = amountQuestions;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmountQuestions() {
        return amountQuestions;
    }
    public void setAmountQuestions(Integer amountQuestions) {
        this.amountQuestions = amountQuestions;
    }
}
