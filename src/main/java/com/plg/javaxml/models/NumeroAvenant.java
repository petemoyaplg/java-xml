package com.plg.javaxml.models;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumeroAvenant", propOrder = { "value" })
public class NumeroAvenant {
  @XmlValue
  protected BigInteger value;
  @XmlAttribute(name = "type", required = true)
  protected String type;
}
