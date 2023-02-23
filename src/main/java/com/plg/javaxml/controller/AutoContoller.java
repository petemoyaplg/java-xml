package com.plg.javaxml.controller;

import java.io.IOException;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plg.javaxml.models.Envelope;
import com.plg.javaxml.services.ConvertAutoToXml;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(path = "auto")
public class AutoContoller {
  @Autowired
  ConvertAutoToXml convertAutoToXml;

  @PostMapping("")
  public Envelope processSouscription() throws JAXBException, IOException, DatatypeConfigurationException {

    log.info("In Controller");
    return this.convertAutoToXml.convertPolicyToXML();
  }
}
