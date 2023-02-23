package com.plg.javaxml.converter;

import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.*;

import com.plg.javaxml.models.Envelope;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Converter {

  public static void convertJavaToXml(Envelope envelope, StringWriter sw) throws JAXBException {
    log.info("Begin Converter Object to XML");
    JAXBContext context = JAXBContext.newInstance(Envelope.class);
    Marshaller marshaller = context.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
    // marshaller.marshal(0, System.out);
    // marshaller.marshal(p, new File(filename));
    // marshaller.marshal(envelope, System.out);
    // marshaller.marshal(envelope, new File("G:\\documentation.xml"));
    marshaller.marshal(envelope, sw);
  }

  public static Object convertXmlToJava(Class<?> c, String filename) throws JAXBException {
    JAXBContext context = JAXBContext.newInstance(c);
    Unmarshaller unmarshaller = context.createUnmarshaller();

    File xmlFile = new File(filename);
    return unmarshaller.unmarshal(xmlFile);
  }
}
