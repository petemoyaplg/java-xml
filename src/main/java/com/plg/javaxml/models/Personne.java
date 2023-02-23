package com.plg.javaxml.models;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Personne", propOrder = {
    "adresse",
    "telephone",
    "profession",
    "denominationSociale",
    "prenom",
    "nom",
    "postnom",
    "sexe",
    "dateNaissance",
    "lieuNaissance",
    "civilite",
    "noImmatriculation",
    "dateImmatriculation",
    "registreImmatriculation"
})
public class Personne {
  protected Adresse adresse;
  protected String telephone;
  protected String profession;
  protected String denominationSociale;
  protected String prenom;
  protected String nom;
  protected String postnom;
  protected Sexe sexe;
  @XmlSchemaType(name = "date")
  protected XMLGregorianCalendar dateNaissance;
  protected LieuNaissance lieuNaissance;
  protected Civilite civilite;
  protected String noImmatriculation;
  @XmlSchemaType(name = "date")
  protected XMLGregorianCalendar dateImmatriculation;
  protected String registreImmatriculation;

  @XmlAttribute(name = "reference", required = true)
  protected String reference;

  @XmlAttribute(name = "nif", required = true)
  protected String nif;
  @XmlAttribute(name = "immatriculation")
  protected String immatriculation;
  @XmlAttribute(name = "paysEtablissement", required = true)
  protected String paysEtablissement;
  @XmlAttribute(name = "personneMorale", required = true)
  protected boolean personneMorale;

  @XmlAttribute(name = "operation")
  protected String operation;
}
