package com.plg.javaxml.models.arca;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bien", propOrder = { "attributs" })
public class Bien {
  @XmlElement(required = true)
  protected Attributs attributs;
  @XmlAttribute(name = "reference", required = true)
  protected String reference;
  @XmlAttribute(name = "operation", required = true)
  protected String operation;
}
