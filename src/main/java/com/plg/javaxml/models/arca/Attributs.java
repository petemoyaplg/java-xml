package com.plg.javaxml.models.arca;

import javax.xml.bind.annotation.*;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attributs", propOrder = { "valeur" })
public class Attributs {
  @XmlElement(required = true)
  protected List<Valeur> valeur;
}
