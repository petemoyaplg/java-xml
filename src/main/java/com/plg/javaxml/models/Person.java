package com.plg.javaxml.models;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Person {
  private int id;
  private String name;
  private LocalDate datenaissance;
}
