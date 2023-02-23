package com.plg.javaxml.models;

import javax.xml.bind.annotation.*;
import java.util.*;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Biens", propOrder = { "bien", "souscriptions" })
public class Biens {
  protected List<Bien> bien;
  protected Souscription souscriptions;
}
