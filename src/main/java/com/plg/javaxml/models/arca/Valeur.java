package com.plg.javaxml.models.arca;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Valeur", propOrder = { "value" })
public class Valeur {
  @XmlValue
  protected String value;
  @XmlAttribute(name = "nom", required = true)
  protected String nom;
}
