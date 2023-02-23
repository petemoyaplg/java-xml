package com.plg.javaxml.models;

import javax.xml.bind.annotation.*;
import java.util.*;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequeteAssures", propOrder = { "personne", "souscriptions" })
public class Assures {
    protected List<Personne> personne;
    protected Souscription souscriptions;
}
