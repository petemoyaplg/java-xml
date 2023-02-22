package com.plg.javaxml.models.arca;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Souscripteur", propOrder = { "personne" })
public class Souscripteur {
  @XmlElement(required = true)
  protected Personne personne;
}
