package com.plg.javaxml.models.arca;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypePrime")
public class TypePrime {
  @XmlAttribute(name = "code", required = true)
  protected String code;
}
