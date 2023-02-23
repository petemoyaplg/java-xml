package com.plg.javaxml.models;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Production", propOrder = {
    "assureur",
    "intermediaire",
    "tauxCommission",
    "produit",
    "exercice",
    "numeroPolice",
    "numeroAvenant",
    "dateEmission",
    "dateEffet",
    "dateEcheance",
    "typePrime",
    "souscripteur",
    "prime",
    "objet"
})
public class Production {
  @XmlElement(required = true)
  protected Assureur assureur;
  protected Intermediaire intermediaire;
  protected BigInteger tauxCommission;
  @XmlElement(required = true)
  protected Produit produit;
  @XmlElement(required = true)
  protected BigInteger exercice;
  @XmlElement(required = true)
  protected String numeroPolice;
  @XmlElement(required = true)
  protected NumeroAvenant numeroAvenant;
  @XmlElement(required = true)
  @XmlSchemaType(name = "date")
  protected XMLGregorianCalendar dateEmission;
  @XmlElement(required = true)
  @XmlSchemaType(name = "date")
  protected XMLGregorianCalendar dateEffet;
  @XmlElement(required = true)
  @XmlSchemaType(name = "date")
  protected XMLGregorianCalendar dateEcheance;
  protected TypePrime typePrime;
  @XmlElement(required = true)
  protected Souscripteur souscripteur;
  protected Prime prime;
  protected List<ObjetAssure> objet;
  @XmlAttribute(name = "id", required = true)
  protected String id;
  @XmlAttribute(name = "repriseArchives")
  protected Boolean repriseArchives;

}
