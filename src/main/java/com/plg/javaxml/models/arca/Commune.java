package com.plg.javaxml.models.arca;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commune")
public class Commune {
  @XmlAttribute(name = "code", required = true)
  protected String code;
}
