package com.plg.javaxml.models;

import javax.xml.bind.annotation.*;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypePrime")
public class TypePrime {
  @XmlAttribute(name = "code", required = true)
  protected String code;
}
