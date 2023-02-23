package com.plg.javaxml.models;

import javax.xml.bind.annotation.*;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Valeur", propOrder = { "value" })
public class Valeur {
  @XmlValue
  protected String value;
  @XmlAttribute(name = "nom", required = true)
  protected String nom;
}
