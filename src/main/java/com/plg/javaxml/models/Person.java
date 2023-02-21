package com.plg.javaxml.models;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.*;

@XmlRootElement
public class Person {
  private int id;
  private String name;

  // private LocalDate datenaissance;
  public Person(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }
}
