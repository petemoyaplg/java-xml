package com.plg.javaxml.models;

import javax.xml.bind.annotation.*;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Intermediaire")
public class Intermediaire {
  @XmlAttribute(name = "numeroAgrement", required = true)
  protected String numeroAgrement;
}
