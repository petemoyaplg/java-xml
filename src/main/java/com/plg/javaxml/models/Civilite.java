package com.plg.javaxml.models;

import javax.xml.bind.annotation.*;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Civilite")
public class Civilite {
  @XmlAttribute(name = "code", required = true)
  protected String code;
}
