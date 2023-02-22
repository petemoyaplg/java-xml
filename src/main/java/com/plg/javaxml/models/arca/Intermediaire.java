package com.plg.javaxml.models.arca;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Intermediaire")
public class Intermediaire {
  @XmlAttribute(name = "numeroAgrement", required = true)
  protected String numeroAgrement;
}
