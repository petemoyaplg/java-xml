package com.plg.javaxml.models;

import java.math.BigInteger;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Garantie", propOrder = {
        "dateEffet",
        "dateEcheance",
        "attributs",
        "prime"
})
public class Garantie {
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateEffet;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateEcheance;
    protected Attributs attributs;
    @XmlElement(required = true)
    protected BigInteger prime;
    @XmlAttribute(name = "code", required = true)
    protected String code;
}
