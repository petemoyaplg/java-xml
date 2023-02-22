package com.plg.javaxml.models.arca;

import javax.xml.bind.annotation.*;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequeteAssures", propOrder = { "personne", "souscriptions" })
public class Assures {
    protected List<Personne> personne;
    protected Souscription souscriptions;
}
