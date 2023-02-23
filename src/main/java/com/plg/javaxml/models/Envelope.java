package com.plg.javaxml.models;

import javax.xml.bind.annotation.*;
import java.util.*;

import javax.xml.datatype.XMLGregorianCalendar;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "enveloppe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Enveloppe", propOrder = { "production", "documentation" })
public class Envelope {
  protected List<Production> production;
  protected List<Documentation> documentation;

  @XmlAttribute(name = "timestamp", required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar timestamp;

  @XmlAttribute(name = "id", required = true)
  protected String id;
  @XmlAttribute(name = "identifiant", required = true)
  protected String identifiant;
  @XmlAttribute(name = "motDePasse", required = true)
  protected String motDePasse;
}
