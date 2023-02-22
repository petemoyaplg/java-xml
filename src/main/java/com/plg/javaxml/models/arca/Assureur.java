package com.plg.javaxml.models.arca;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assureur")
public class Assureur {
  @XmlAttribute(name = "numeroAgrement", required = true)
  protected String numeroAgrement;
}
