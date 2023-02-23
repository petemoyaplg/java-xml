package com.plg.javaxml.models;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Produit", propOrder = { "value" })
public class Produit {
  @XmlValue
  protected String value;
  @XmlAttribute(name = "version", required = true)
  protected BigInteger version;
}
