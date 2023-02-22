package com.plg.javaxml.models.arca;

import javax.xml.bind.annotation.*;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Souscription", propOrder = { "garantie" })
public class Souscription {
  @XmlElement(required = true)
  protected List<Garantie> garantie;
}
