package com.plg.javaxml.models;

import javax.xml.bind.annotation.*;
import java.util.*;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attributs", propOrder = { "valeur" })
public class Attributs {
  @XmlElement(required = true)
  protected List<Valeur> valeur;
}
