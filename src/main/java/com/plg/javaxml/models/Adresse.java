package com.plg.javaxml.models;

import javax.xml.bind.annotation.*;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adresse", propOrder = {
    "adresseEtranger",
    "voie",
    "commune",
    "quartier",
    "complement"
})
public class Adresse {
  protected String adresseEtranger;
  protected String voie;
  protected Commune commune;
  protected String quartier;
  protected String complement;
}
