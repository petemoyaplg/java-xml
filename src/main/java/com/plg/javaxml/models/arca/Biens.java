package com.plg.javaxml.models.arca;

import javax.xml.bind.annotation.*;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Biens", propOrder = { "bien", "souscriptions" })
public class Biens {
  protected List<Bien> bien;
  protected Souscription souscriptions;
}
