package com.plg.javaxml.models.arca;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prime", propOrder = { "fraisAccessoires", "taxeValeurAjoutee" })
public class Prime {
  protected BigInteger fraisAccessoires;
  protected BigInteger taxeValeurAjoutee;
  @XmlAttribute(name = "devise", required = true)
  protected String devise;
  @XmlAttribute(name = "taux")
  protected BigInteger taux;
}
