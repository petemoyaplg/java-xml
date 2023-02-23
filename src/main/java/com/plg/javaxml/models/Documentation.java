package com.plg.javaxml.models;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Documentation")
public class Documentation {
  @XmlAttribute(name = "id", required = true)
  protected String id;
  @XmlAttribute(name = "idProduit")
  protected String idProduit;
  @XmlAttribute(name = "version")
  protected BigInteger version;
  @XmlAttribute(name = "idCode")
  protected String idCode;
}
