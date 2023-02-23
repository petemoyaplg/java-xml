package com.plg.javaxml.models;

import javax.xml.bind.annotation.*;
import java.util.*;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Souscription", propOrder = { "garantie" })
public class Souscription {
  @XmlElement(required = true)
  protected List<Garantie> garantie;
}
