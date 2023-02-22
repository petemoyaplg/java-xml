package com.plg.javaxml.models.arca;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sexe")
public class Sexe {
  @XmlAttribute(name = "code", required = true)
  protected String code;
}
