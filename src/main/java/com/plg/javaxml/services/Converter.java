package com.plg.javaxml.services;

import java.io.File;
import java.util.List;

import javax.xml.bind.*;

import org.springframework.stereotype.Service;

// import com.plg.javaxml.models.Banque;
// import com.plg.javaxml.models.Compte;

@Service
public class Converter {
  // public void convertJavaToXml(Banque banque, String filename) throws
  // JAXBException {
  // JAXBContext context = JAXBContext.newInstance(Compte.class);
  // List<Compte> comptes = banque.getComptes();
  // Marshaller marshaller = context.createMarshaller();
  // marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
  // for (Compte compte : comptes) {
  // marshaller.marshal(compte, System.out);
  // }
  // }
  public static void convertJavaToXml(Object o, String filename) throws JAXBException {
    JAXBContext context = JAXBContext.newInstance(o.getClass());
    Marshaller marshaller = context.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
    // marshaller.marshal(0, System.out);
    marshaller.marshal(0, new File(filename));
  }

  public static Object convertXmlToJava(Class<?> c, String filename) throws JAXBException {
    JAXBContext context = JAXBContext.newInstance(c);
    Unmarshaller unmarshaller = context.createUnmarshaller();
    
    File xmlFile = new File(filename);
    return unmarshaller.unmarshal(xmlFile);
  }
}
