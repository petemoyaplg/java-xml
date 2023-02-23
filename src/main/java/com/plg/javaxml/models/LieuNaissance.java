package com.plg.javaxml.models;

import javax.xml.bind.annotation.*;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LieuNaissance", propOrder = { "value" })
public class LieuNaissance {
  @XmlValue
  protected String value;
  @XmlAttribute(name = "codePays", required = true)
  protected String codePays;
}
