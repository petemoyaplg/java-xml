package com.plg.javaxml.services;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.plg.javaxml.models.*;
import com.plg.javaxml.converter.*;

import java.util.*;
import java.io.*;
import java.time.LocalDateTime;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ConvertAutoToXml {

  @Autowired
  private Environment environment;

  public Envelope convertPolicyToXML() throws JAXBException, DatatypeConfigurationException {
    log.info("In ConvertAutoToXml");

    // Traitement envelope
    Envelope envelope = this.processEnvelope();

    Production production = this.processProduction();

    List<Production> productions = new ArrayList<>();
    productions.add(production);
    envelope.setProduction(productions);

    StringWriter sw = new StringWriter();

    // Converter.convertJavaToXml(envelope, sw);
    return envelope;
  }

  private Production processProduction() {
    Production production = new Production();

    Assureur assureur = new Assureur();
    String numeroAgrement = environment.getProperty("numero-agrement");
    assureur.setNumeroAgrement(numeroAgrement);
    production.setAssureur(assureur);

    NumeroAvenant numeroAvenant = new NumeroAvenant();
    numeroAvenant.setValue(null);

    Intermediaire intermediaire = new Intermediaire();
    intermediaire.setNumeroAgrement(numeroAgrement);
    production.setIntermediaire(intermediaire);

    return production;
  }

  private Envelope processEnvelope() throws DatatypeConfigurationException {
    Envelope envelope = new Envelope();

    String currentUnixTime = String.valueOf(System.currentTimeMillis());
    envelope.setId(currentUnixTime);
    envelope.setIdentifiant(environment.getProperty("identifiant-arca"));
    envelope.setMotDePasse(environment.getProperty("mot-de-masse-arca"));
    LocalDateTime dateTime = LocalDateTime.now();
    XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory.newInstance()
        .newXMLGregorianCalendar(dateTime.toString());
    envelope.setTimestamp(xmlGregorianCalendar);
    return envelope;
  }
}
