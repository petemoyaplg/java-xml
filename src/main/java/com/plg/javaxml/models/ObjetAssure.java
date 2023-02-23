package com.plg.javaxml.models;

import javax.xml.bind.annotation.*;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjetAssure", propOrder = { "assures", "biens" })
public class ObjetAssure {
  protected Assures assures;
  protected Biens biens;
  @XmlAttribute(name = "code", required = true)
  protected String code;
  @XmlAttribute(name = "reference", required = true)
  protected String reference;
}
