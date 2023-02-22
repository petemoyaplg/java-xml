package com.plg.javaxml.models.arca;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LieuNaissance", propOrder = { "value" })
public class LieuNaissance {
  @XmlValue
  protected String value;
  @XmlAttribute(name = "codePays", required = true)
  protected String codePays;
}
