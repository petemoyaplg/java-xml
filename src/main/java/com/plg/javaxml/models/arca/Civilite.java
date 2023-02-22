package com.plg.javaxml.models.arca;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Civilite")
public class Civilite {
  @XmlAttribute(name = "code", required = true)
  protected String code;
}
