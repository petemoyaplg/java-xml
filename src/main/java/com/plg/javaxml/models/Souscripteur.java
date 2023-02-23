package com.plg.javaxml.models;

import javax.xml.bind.annotation.*;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Souscripteur", propOrder = { "personne" })
public class Souscripteur {
  @XmlElement(required = true)
  protected Personne personne;
}
