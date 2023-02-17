package com.plg.javaxml.services;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class Converter {
  public static void convertJavaToXml(Object o, String filename) throws JAXBException {
    JAXBContext context = JAXBContext.newInstance(o.getClass());
  }
}
